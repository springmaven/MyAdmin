package com.ruoyi;


import com.yly.java.yly_sdk.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 打印机配置
 */
@Configuration
public class YiLianYunConfiguration {

    /**
     * 易联云打印机
     * @param properties
     * @return
     */
    @Bean
    public RequestMethod getPrinterRequestConfig(@Autowired PrinterProperties properties) throws Exception {
        RequestMethod requestMethod=RequestMethod.getInstance();
        requestMethod.init(properties.getClientId(),properties.getClientSecret());
        String accessToken = requestMethod.getAccessToken();
        requestMethod .addPrinter( properties.getMachineCode(), properties.getMsign(), accessToken);
        return requestMethod;
    }
}
