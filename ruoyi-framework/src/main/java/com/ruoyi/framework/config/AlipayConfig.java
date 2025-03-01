package com.ruoyi.framework.config;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;
import com.ruoyi.framework.config.properties.AlipayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 支付宝配置
 * zzw
 */
@Configuration
public class AlipayConfig {

    /**
     * 非证书模式
     * @param properties
     * @return
     */
    @Bean
    public Config getConfig(@Autowired AlipayProperties properties) {
        Config config = new Config();
        // 网关协议
        config.protocol = properties.getProtocol().trim();
        // 网关地址
        config.gatewayHost = properties.getGatewayHost().trim();
        // 密钥加密方式
        config.signType = properties.getSignType().trim();
        // 应用识别码APPID
        config.appId = properties.getAppId().trim();
        // 应用私钥
        config.merchantPrivateKey = properties.getMerchantPrivateKey().trim();
        // 支付宝公钥
        config.alipayPublicKey = properties.getAlipayPublicKey().trim();
        //可设置异步通知接收服务地址（可选）
        //"<-- 请填写您的支付类接口异步通知接收服务地址，例如：https://www.test.com/callback -->"
        config.notifyUrl = properties.getNotifyUrl().trim();;
        //可设置AES密钥，调用AES加解密相关接口时需要（可选）
        //"<-- 请填写您的AES密钥，例如：aa4BtZ4tspm2wnXLb1ThQA== -->"
        config.encryptKey =properties.getEncryptKey().trim() ;
        // Factory全局只需配置一次
        Factory.setOptions(config);
        return config;
    }
}
