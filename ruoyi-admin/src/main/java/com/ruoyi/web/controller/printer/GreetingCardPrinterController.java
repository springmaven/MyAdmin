package com.ruoyi.web.controller.printer;

import com.yly.java.yly_sdk.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 贺卡打印
 */
@Controller
@RequestMapping("/biz/greetingCard")
public class GreetingCardPrinterController {
    /**
     * 易联打印机
     */
    private RequestMethod requestMethod;


    @GetMapping("/printer")
    @ResponseBody
    private Map<String, String> printer(@PathVariable("content") String content) throws Exception {
        HashMap<String, String> ret = new HashMap<>();
        String accessToken = requestMethod.getAccessToken();
        //失效后刷新
        //requestMethod.getRefreshAccessToken(accessToken);

        //指定机器-文本打印
        /* @param access_token 授权的token 必要参数
         * @param machine_code 易联云打印机终端号
         * @param content 打印内容(需要urlencode)，排版指令详见打印机指令
         * @param origin_id 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母 ，且在同一个client_id下唯一。详见商户订单号
         */
        String machine_code="";
        String origin_id="";
        requestMethod.printIndex(accessToken,machine_code,content,origin_id);


        return ret;
    }

}
