package com.ruoyi.web.controller.order;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.adapter.HzOrderAdapter;
import com.ruoyi.adapter.model.HzOrderCancelModel;
import com.ruoyi.adapter.model.HzOrderModel;
import com.ruoyi.client.DadaApiResponse;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.base.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.order.OrderStatusEnum;
import com.ruoyi.order.domain.BdOrder;
import com.ruoyi.order.service.BdOrderService;
import com.ruoyi.web.vo.OrderDetailVo;
import com.ruoyi.web.vo.SelectVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.ListUtils;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by liangjun on 2020/8/29.
 */
@Controller
@RequestMapping("/biz/order")
public class BdOrderController  extends BaseController {

     private String prefix = "biz/order";

    @Resource
    private BdOrderService bdOrderService;

    @Resource
    private HzOrderAdapter hzOrderAdaper;

    private static  Logger LOGGER= LoggerFactory.getLogger(BdOrderController.class);

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BdOrder querParam,ModelMap mmap)
    {
        startPage();
        List<BdOrder> list = bdOrderService.queryOrder(querParam);
        Optional.ofNullable(list).ifPresent(os->os.forEach(order->{
            order.setStatus(OrderStatusEnum.getInstanceByValue(order.getStatus()).getDesc());
        }));
        return getDataTable(list);
    }

    @GetMapping("/delivery/{orderId}/{rePost}")
    public String delivery(HttpServletRequest request, HttpServletResponse response, @PathVariable("orderId") Long orderId, @PathVariable("rePost") int rePost, ModelMap mmap)
    {
        BdOrder bdOrder = getBdOrder(orderId);
        mmap.put("order", bdOrder);
        mmap.put("rePost", rePost);
        return prefix + "/delivery";
    }

    @GetMapping("/getDetail/{orderId}")
    public String getDetail(@PathVariable("orderId") Long orderId, ModelMap mmap)
    {
        DadaApiResponse daResult=hzOrderAdaper.getOrderDetail(String.valueOf(orderId));
        JSONObject detail= (JSONObject)daResult.getResult();
        OrderDetailVo detailVo=JSON.toJavaObject(detail, OrderDetailVo.class);
        mmap.put("orderDetail",detailVo);
        return prefix+"/detail";

    }

    @GetMapping("/getReason/{orderId}")
    public String getReson(@PathVariable("orderId") Long orderId,ModelMap mmap)
    {
        DadaApiResponse  daResult= hzOrderAdaper.getCancelReason();
        if("success".equals(daResult.getStatus())){
            JSONArray result=(JSONArray)daResult.getResult();
            List<SelectVo> reasonList=JSON.toJavaObject(result, List.class );
            mmap.put("reasons", reasonList);
            mmap.put("orderId", orderId);
        }
        return prefix + "/cancel";
    }

    @Log(title = "消息回传", businessType = BusinessType.IMPORT)
    @PostMapping("/callback")
    @ResponseBody
    public AjaxResult callback (HttpServletRequest request,@RequestBody JSONObject jsonObject)
    {
        try {
            String orderId = (String) jsonObject.get("order_id");
            String orderStatus = jsonObject.get("order_status").toString();
            List<BdOrder> orders = bdOrderService.queryOrderByOutBizCode("bdhy", orderId);
            BdOrder bdOrder = orders.get(0);
            bdOrder.setStatus(OrderStatusEnum.getInstanceByKey(orderStatus).getValue());
            bdOrder.setGmtModified(new Date());
            bdOrderService.updateBdOrder(bdOrder);
        }catch(Exception e){
            LOGGER.error("dada callback error",e);
            return AjaxResult.dadaError();
        }
        return AjaxResult.dadaSuccess();
    }


    private BdOrder getBdOrder(@PathVariable("orderId") Long orderId) {
        BdOrder bdOrder=bdOrderService.queryById(orderId);
        HzOrderModel hzOrderModel = getHzOrderModel(bdOrder);
        DadaApiResponse daResult=hzOrderAdaper.getPrice(hzOrderModel);
        JSONObject jsonObject=(JSONObject)daResult.getResult();
        bdOrder.setDeliveryCost(Float.valueOf(jsonObject.get("deliverFee").toString()));
        return bdOrder;
    }

    private HzOrderModel getHzOrderModel(BdOrder bdOrder) {
        HzOrderModel hzOrderModel =new HzOrderModel();
        hzOrderModel.setReceiverPhone(bdOrder.getReceiverPhone());
        hzOrderModel.setReceiverName(bdOrder.getClientName());
        hzOrderModel.setReceiverLng(BigDecimal.valueOf(bdOrder.getLng()));
        hzOrderModel.setReceiverLat(BigDecimal.valueOf(bdOrder.getLat()));
        hzOrderModel.setReceiverAddress(bdOrder.getToAddress());
        hzOrderModel.setOriginId(bdOrder.getOutBizNo());
        hzOrderModel.setIsPrepay(0);
        hzOrderModel.setCityCode(bdOrder.getToCity());
        hzOrderModel.setCargoPrice(BigDecimal.valueOf(bdOrder.getOrderPrice()));
        hzOrderModel.setShopNo("11047059");
        hzOrderModel.setCallback("http://81.69.42.155:8080/biz/order/callback");
        return hzOrderModel;
    }

    @Log(title = "商家发货", businessType = BusinessType.IMPORT)
    @PostMapping("/postDev")
    @ResponseBody
    public AjaxResult delivery1(HttpServletRequest request, HttpServletResponse response,@RequestParam("id") long  id,@RequestParam("rePost") int  rePost) throws Exception
    {
        BdOrder bdOrder=bdOrderService.queryById(id);
        HzOrderModel hzOrderModel = getHzOrderModel(bdOrder);
        if(!"y".equals(bdOrder.getPayStatus())){
            return AjaxResult.success("noDelivery");
        }else {
            DadaApiResponse daResult = hzOrderAdaper.createOrder(hzOrderModel, 1 == rePost);
            if ("success".equals(daResult.getStatus())) {
                JSONObject jsonObject = (JSONObject) daResult.getResult();
                bdOrder.setDeliveryCost(Float.valueOf(jsonObject.get("deliverFee").toString()));
                bdOrder.setStatus(OrderStatusEnum.WAIT_ACCEPT.getValue());
                bdOrder.setGmtModified(new Date());
                bdOrderService.updateBdOrder(bdOrder);
                return AjaxResult.success("发货成功，配送费：" + bdOrder.getDeliveryCost());
            } else {
                return AjaxResult.error(daResult.getMsg());
            }
        }
    }

    @Log(title = "商家发货", businessType = BusinessType.IMPORT)
    @GetMapping("/postDev/{orderId}/{rePost}")
    public String delivery(@PathVariable("orderId") long  id,@PathVariable("rePost") int  rePost) throws Exception
    {
        BdOrder bdOrder=bdOrderService.queryById(id);
        HzOrderModel hzOrderModel = getHzOrderModel(bdOrder);
        DadaApiResponse daResult= hzOrderAdaper.createOrder(hzOrderModel,1==rePost);
        LOGGER.info("发货结果："+JSON.toJSONString(daResult));
        if("success".equals(daResult.getStatus())) {
            JSONObject jsonObject=(JSONObject)daResult.getResult();
            bdOrder.setDeliveryCost(Float.valueOf(jsonObject.get("deliverFee").toString()));
            bdOrder.setStatus(OrderStatusEnum.WAIT_ACCEPT.getValue());
            bdOrder.setGmtModified(new Date());
            bdOrder.setPayStatus("y");
            bdOrderService.updateBdOrder(bdOrder);
            return prefix+"/sendSuccess";
        }else{

            return  prefix+"/sendError";
        }
    }

    @Log(title = "商家发货", businessType = BusinessType.IMPORT)
    @PostMapping("/pay")
    @ResponseBody
    public AjaxResult isPayed(@RequestParam("id") long  id) throws Exception
    {
        BdOrder bdOrder=bdOrderService.queryById(id);
        if(!"y".equals(bdOrder.getPayStatus())){
            return AjaxResult.error("付款未成功，请重新发货");
        }
        return AjaxResult.success("发货成功");
    }

    @Log(title = "商家取消发货", businessType = BusinessType.IMPORT)
    @PostMapping("/cancel")
    @ResponseBody
    public AjaxResult cancel(@RequestParam("cancelReasonId") int  cancelReasonId,@RequestParam("cancelReason") String  cancelReason,@RequestParam("orderId") long  orderId) throws Exception
    {

        BdOrder bdOrder=bdOrderService.queryById(orderId);
        HzOrderCancelModel hzOrderCancelModel = new HzOrderCancelModel();
        hzOrderCancelModel.setOrderId(String.valueOf(bdOrder.getOutBizNo()));
        hzOrderCancelModel.setOrderReason(StringUtils.isEmpty(cancelReason)?"其他":cancelReason);
        hzOrderCancelModel.setOrderReasonId(cancelReasonId);
        DadaApiResponse daResult= hzOrderAdaper.cancelOrder(hzOrderCancelModel);
        if("success".equals(daResult.getStatus())) {
            JSONObject jsonObject=(JSONObject)daResult.getResult();
            bdOrder.setGmtModified(new Date());
            bdOrder.setStatus(OrderStatusEnum.CANCELED.getValue());
            bdOrderService.updateBdOrder(bdOrder);
            return AjaxResult.success("发货取消成功");
        }else{
            return AjaxResult.error(daResult.getMsg());
        }
    }

    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    @Log(title = "获取订单", businessType = BusinessType.INSERT)
    @PostMapping("/createOrder")
    @ResponseBody
    public AjaxResult createOrder(@RequestBody String bdorder){
        try {
            bdorder= URLDecoder.decode(bdorder,"utf-8").replace("]=","]").replace("￥","").replace("\\n"," ").replace("|","");
            List<BdOrder> bdOrders=JSON.parseArray(bdorder,BdOrder.class);
            if(!ListUtils.isEmpty(bdOrders)) {
                bdOrders.forEach(order->{
                    try {
                        Thread.sleep(300);
                        String thirdAddress=HttpUtils.sendGet("https://apis.map.qq.com/ws/geocoder/v1/","key=CINBZ-OFV36-PSMST-E4OUN-2WBX5-HGB3J&address="+ URLEncoder.encode(order.getToAddress(),"utf-8"));
                        Map addressMap=(Map)JSON.parseObject(thirdAddress, HashMap.class).get("result");
                        Map componentsMap=(Map)addressMap.get("address_components");
                        Map locationMap=(Map)addressMap.get("location");
                        order.setToProvince((String)componentsMap.get("province"));
                        order.setToCity((String)componentsMap.get("city"));
                        order.setToArea((String)componentsMap.get("district"));
                        order.setToProvince((String)componentsMap.get("province"));
                        order.setLng(Float.parseFloat(String.valueOf(locationMap.get("lng"))));
                        order.setLat(Float.parseFloat(String.valueOf(locationMap.get("lat"))));
                        order.setAddressUnit((String)addressMap.get("title"));
                        if (StringUtils.isNotEmpty(order.getTenantCode()) && StringUtils.isNotEmpty(order.getOutBizNo())) {
                            List<BdOrder> orders = bdOrderService.queryOrderByOutBizCode(order.getTenantCode(), order.getOutBizNo());
                            if (!ListUtils.isEmpty(orders)) {
                                BdOrder ord = orders.get(0);
                                Optional.ofNullable(order.getClientName()).ifPresent(cn->ord.setClientName(cn));
                                Optional.ofNullable(order.getToAddress()).ifPresent(ta->ord.setToAddress(ta));
                                Optional.ofNullable(order.getReceiverPhone()).ifPresent(rp->ord.setReceiverPhone(rp));
                                Optional.ofNullable(order.getStatus()).ifPresent(st->ord.setStatus(st));
                                Optional.ofNullable(order.getPrice()).ifPresent(pr->ord.setPrice(pr));
                                Optional.ofNullable(order.getImg()).ifPresent(pr->ord.setImg(pr));
                                Optional.ofNullable(order.getDetail()).ifPresent(dt->ord.setDetail(dt));
                                Optional.ofNullable(order.getHeka()).ifPresent(dt->ord.setHeka(dt));
                                Optional.ofNullable(order.getToProvince()).ifPresent(dt->ord.setToProvince(dt));
                                Optional.ofNullable(order.getToArea()).ifPresent(dt->ord.setToArea(dt));
                                Optional.ofNullable(order.getToCity()).ifPresent(dt->ord.setToCity(dt));
                                Optional.ofNullable(order.getDeliveryDate()).ifPresent(dt->ord.setDeliveryDate(dt));
                                Optional.ofNullable(order.getLng()).ifPresent(dt->ord.setLng(dt));
                                Optional.ofNullable(order.getLat()).ifPresent(dt->ord.setLat(dt));
                                Optional.ofNullable(order.getOrderSource()).ifPresent(dt->ord.setOrderSource(dt));
                                Optional.ofNullable(order.getAddressUnit()).ifPresent(dt->ord.setAddressUnit(dt));
                                ord.setToArea(order.getToArea());
                                ord.setToProvince(order.getToProvince());
                                ord.setToCity(order.getToCity());
                                bdOrderService.updateBdOrder(ord);
                            } else {
                                bdOrderService.createBdOrder(order);
                            }
                        }
                    }catch(Exception e){
                        LOGGER.error("order is  error orderOutBizNo is "+order.getOutBizNo(),e);
                    }
                });

            }
            return  toAjax(true);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }




}
