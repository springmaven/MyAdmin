package com.ruoyi.web.controller.pay;

import com.alipay.easysdk.factory.Factory.Payment;
import com.alipay.easysdk.payment.page.models.AlipayTradePagePayResponse;
import com.ruoyi.order.domain.BdOrder;
import com.ruoyi.order.service.BdOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("/biz/orderPay")
public class AliPayController {

    private static Logger logger = LoggerFactory.getLogger(AliPayController.class);
    private String prefix = "pay";

    @Autowired
    private BdOrderService bdOrderService;

    @Value("${alipay.paySuccessUrl}")
    private String paySuccessUrl;

    @GetMapping("/getPayData/{orderId}")
    @ResponseBody
   private  Map<String, Object> getQRCodeUrl(@PathVariable("orderId") Long orderId){
        try {
                HashMap<String, Object> errorMessage = new HashMap<>();
            if(null==orderId){
                errorMessage.put("error","参数错误");
                return errorMessage;
            }
            BdOrder bdOrder = bdOrderService.queryById(orderId);
            //TODO 判断是否已支付
            if(null==bdOrder||null==bdOrder.getPrice()||bdOrder.getPrice()==0){
                errorMessage.put("error","订单错误");
                return errorMessage;
            }
            String orderSubject = bdOrder.getDetail();
            String orderTotalAmount=bdOrder.getPrice().toString();
            String orderTradeNo=bdOrder.getOutBizNo();
            //商品名称
            String subject=orderSubject;
            //商品id String.valueOf(LocalTime.now().getNano());
            String outTradeNo=orderTradeNo;
            //金额 精确到小数点后两位，范围为[0.01,9999999999999.99]
            String totalAmount=orderTotalAmount;
            //支付完成回调页面
            String returnUrl=paySuccessUrl+"/biz/order/postDev/"+orderId+"/0";
            AlipayTradePagePayResponse response = Payment.Page().pay(subject,outTradeNo,totalAmount,returnUrl);
            return wrapResponse(response.getBody());
        } catch (Exception e) {
            logger.warn("调用异常，原因：{}", e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }


    @GetMapping("/paySuccess")
    public String paySuccess() {


        return prefix + "/result/paySuccess";
    }

    @GetMapping("/alipayEntrance/{orderId}")
    public String alipayEntrance(@PathVariable("orderId") Long orderId,ModelMap modelMap) {
        modelMap.put("orderId",orderId);
        return prefix + "/alipay/alipayEntrance";
    }

    @GetMapping("/callback")
    public Object callback(HttpServletRequest request){
        try {
            Map<String, String> params = new HashMap<>();
            System.out.println(params);

            Map parameterMap = request.getParameterMap();
            for(Iterator iter = parameterMap.keySet().iterator(); iter.hasNext();){
                String name = (String)iter.next();
                String[] values = (String[]) parameterMap.get(name);
                String valueStr = "";
                for(int i=0; i<values.length;i++){
                    valueStr = (i == values.length-1) ? valueStr + values[i] : valueStr + values[i] + ",";
                }
                params.put(name,valueStr);
            }
            logger.info("支付宝回调: sign:{}, trade_status:{}, 参数:{}",params.get("sign"),params.get("trade_status"),params.toString());


//            Map<String, String> parameters = new HashMap<>();
//            parameters.put("charset", "UTF-8");
//            parameters.put("sign", "GM0CbuqaEivqgb......");
//            parameters.put("app_id", "2018091261392200");
//            parameters.put("sign_type", "RSA2");
//            parameters.put("isv_ticket", "");
//            parameters.put("timestamp", "2020-03-25 16:27:08");

            Boolean aBoolean = Payment.Common().verifyNotify(params);
        }catch (Exception e){

        }





        return prefix + "/alipay/alipayEntrance";
    }

    private Map<String, Object> wrapResponse(Object data) {
        return new HashMap<String, Object>(3){{
            put("msg", "success");
            put("code", "20000");
            put("data", data);
        }};
    }




}

