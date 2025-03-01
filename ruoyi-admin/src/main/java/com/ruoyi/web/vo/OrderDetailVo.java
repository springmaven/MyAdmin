package com.ruoyi.web.vo;

import java.math.BigDecimal;

/**
 * Created by liangjun on 2020/11/1.
 */
public class OrderDetailVo {

    public String		   orderId	     ;// 		第三方订单编号
    public String		   statusMsg	    ;//	订单状态
    public String		   transporterName;//		骑手姓名
    public String		   transporterPhone;//	骑手电话
    public String		   transporterLng;//		骑手经度
    public String		   transporterLat;//		骑手纬度
    public Double		   deliveryFee	;//		配送费,单位为元
    public Double		   tips			;//	小费,单位为元
    public Double		   couponFee		;//	优惠券费用,单位为元
    public Double		   insuranceFee	;//	保价费,单位为元
    public Double		   actualFee		;//	实际支付费用,单位为元
    public Double		   distance		;//	配送距离,单位为米
    public String		   createTime	;//		发单时间
    public String		   acceptTime	;//		接单时间,若未接单,则为空
    public String		   fetchTime		;//	取货时间,若未取货,则为空
    public String		   finishTime	;//		送达时间,若未送达,则为空
    public String		   cancelTime	;//		取消时间,若未取消,则为空
    public String		   orderFinishCode;//		收货码
    public BigDecimal deductFee		;//		违约金

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getTransporterName() {
        return transporterName;
    }

    public void setTransporterName(String transporterName) {
        this.transporterName = transporterName;
    }

    public String getTransporterPhone() {
        return transporterPhone;
    }

    public void setTransporterPhone(String transporterPhone) {
        this.transporterPhone = transporterPhone;
    }

    public String getTransporterLng() {
        return transporterLng;
    }

    public void setTransporterLng(String transporterLng) {
        this.transporterLng = transporterLng;
    }

    public String getTransporterLat() {
        return transporterLat;
    }

    public void setTransporterLat(String transporterLat) {
        this.transporterLat = transporterLat;
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Double getTips() {
        return tips;
    }

    public void setTips(Double tips) {
        this.tips = tips;
    }

    public Double getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(Double couponFee) {
        this.couponFee = couponFee;
    }

    public Double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(Double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public Double getActualFee() {
        return actualFee;
    }

    public void setActualFee(Double actualFee) {
        this.actualFee = actualFee;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getOrderFinishCode() {
        return orderFinishCode;
    }

    public void setOrderFinishCode(String orderFinishCode) {
        this.orderFinishCode = orderFinishCode;
    }

    public BigDecimal getDeductFee() {
        return deductFee;
    }

    public void setDeductFee(BigDecimal deductFee) {
        this.deductFee = deductFee;
    }
}
