package com.ruoyi.adapter.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * Created by liangjun on 2020/10/25.
 */
public class HzOrderCancelModel {

    private int  orderReasonId;

    private String orderId;

    private String orderReason;

    public int getOrderReasonId() {
        return orderReasonId;
    }

    public void setOrderReasonId(int orderReasonId) {
        this.orderReasonId = orderReasonId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }
}
