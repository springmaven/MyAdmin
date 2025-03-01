package com.ruoyi.domain.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.ruoyi.domain.BaseModel;

import java.math.BigDecimal;


public class OrderCancelModel extends BaseModel {

    @JSONField(name = "cancel_reason_id")
    private int  orderReasonId;

    @JSONField(name = "order_id")
    private String orderId;

    @JSONField(name = "cancel_reason")
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
