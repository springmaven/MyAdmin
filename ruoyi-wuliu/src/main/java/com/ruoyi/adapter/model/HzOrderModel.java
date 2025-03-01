package com.ruoyi.adapter.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * Created by liangjun on 2020/10/25.
 */
public class HzOrderModel {

    private String shopNo;

    private String originId;

    private String cityCode;

    private BigDecimal cargoPrice;

    private Integer isPrepay;

    private String receiverName;

    private String receiverAddress;

    private BigDecimal receiverLat;

    private BigDecimal receiverLng;

    private String callback;

    private String receiverPhone;


    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public BigDecimal getCargoPrice() {
        return cargoPrice;
    }

    public void setCargoPrice(BigDecimal cargoPrice) {
        this.cargoPrice = cargoPrice;
    }

    public Integer getIsPrepay() {
        return isPrepay;
    }

    public void setIsPrepay(Integer isPrepay) {
        this.isPrepay = isPrepay;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public BigDecimal getReceiverLat() {
        return receiverLat;
    }

    public void setReceiverLat(BigDecimal receiverLat) {
        this.receiverLat = receiverLat;
    }

    public BigDecimal getReceiverLng() {
        return receiverLng;
    }

    public void setReceiverLng(BigDecimal receiverLng) {
        this.receiverLng = receiverLng;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
}
