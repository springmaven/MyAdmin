package com.ruoyi.adapter;

import com.alibaba.fastjson.JSON;
import com.ruoyi.adapter.model.HzOrderCancelModel;
import com.ruoyi.adapter.model.HzOrderModel;
import com.ruoyi.client.DadaApiResponse;
import com.ruoyi.client.DadaRequestClient;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.config.AppConfig;
import com.ruoyi.config.UrlConstant;
import com.ruoyi.domain.order.OrderAddModel;
import com.ruoyi.domain.order.OrderCancelModel;
import com.ruoyi.domain.order.QueryFeeModel;
import com.ruoyi.service.order.OrderOperateService;
import com.ruoyi.service.order.QueryFeeService;
import com.ruoyi.utils.JSONUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by liangjun on 2020/10/25.
 */
@Service
public class HzOrderAdapter {

    public  DadaApiResponse createOrder(HzOrderModel hzOrderModel,boolean isRePost) {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        OrderAddModel orderAddModel = new OrderAddModel();
        // 根据实际信息来填写门店地址
        BeanUtils.copyBeanProp(orderAddModel,hzOrderModel);

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        OrderOperateService orderOperateService = new OrderOperateService(UrlConstant.ORDER_ADD_URL,JSONUtil.toJson(orderAddModel));
        if(isRePost){
            orderOperateService =new OrderOperateService(UrlConstant.RE_ORDER_ADD_URL,JSONUtil.toJson(orderAddModel));
        }
        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderOperateService, appConfig);
        return dadaClient.callRpc();
    }

    public  DadaApiResponse cancelOrder(HzOrderCancelModel hzOrderCancelModel) {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        OrderCancelModel orderCancelModel = new OrderCancelModel();
        // 根据实际信息来填写门店地址
        BeanUtils.copyBeanProp(orderCancelModel,hzOrderCancelModel);

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        OrderOperateService orderOperateService = new OrderOperateService(UrlConstant.CANCEL_ORDER,JSONUtil.toJson(orderCancelModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderOperateService, appConfig);
        return dadaClient.callRpc();
    }


    public  DadaApiResponse getCancelReason() {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        OrderCancelModel orderCancelModel = new OrderCancelModel();
        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        OrderOperateService orderOperateService = new OrderOperateService(UrlConstant.CANCEL_REASON,JSONUtil.toJson(orderCancelModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderOperateService, appConfig);
        return dadaClient.callRpc();
    }

    public  DadaApiResponse getOrderDetail(String outBizNo) {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        OrderCancelModel orderCancelModel = new OrderCancelModel();
        orderCancelModel.setOrderId(outBizNo);
        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        OrderOperateService orderOperateService = new OrderOperateService(UrlConstant.ORDER_QUERY,JSONUtil.toJson(orderCancelModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderOperateService, appConfig);
        return dadaClient.callRpc();
    }


    public  DadaApiResponse getPrice(HzOrderModel hzOrderModel) {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        QueryFeeModel queryFeeModel = new QueryFeeModel();
        // 根据实际信息来填写门店地址
        BeanUtils.copyBeanProp(queryFeeModel,hzOrderModel);

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        QueryFeeService queryFeeService = new QueryFeeService(JSONUtil.toJson(queryFeeModel));
        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(queryFeeService, appConfig);
        return dadaClient.callRpc();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        HzOrderModel hzModel=new HzOrderModel();
        hzModel.setShopNo("11047059");
        hzModel.setCargoPrice(BigDecimal.valueOf(8.0));
        hzModel.setCityCode("0571");
        hzModel.setIsPrepay(0);
        hzModel.setOriginId("4323462432");
        hzModel.setReceiverAddress("杭州市萧山区北辰奥园");
        hzModel.setReceiverLat(BigDecimal.valueOf(30.13064));
        hzModel.setReceiverLng(BigDecimal.valueOf(120.24749));
        hzModel.setReceiverName("黄先生");
        hzModel.setReceiverPhone("132323232323");
        hzModel.setCallback("http://xxxxxxxxxxxxxxxxxxxxxxxx");


        System.out.printf(JSON.toJSONString(new HzOrderAdapter().getOrderDetail("20200929412831649")));
    }


}
