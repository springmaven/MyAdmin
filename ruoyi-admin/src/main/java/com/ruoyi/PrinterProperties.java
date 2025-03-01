package com.ruoyi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 打印机配置
 */
@Component
@ConfigurationProperties(prefix = "printer")
public class PrinterProperties {
    //应用ID
    private String clientId;
    //应用密钥
    private String clientSecret;
    //易联云打印机终端号
    String machineCode;
    //易联云打印机终端密钥
    String msign;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getMsign() {
        return msign;
    }

    public void setMsign(String msign) {
        this.msign = msign;
    }
}
