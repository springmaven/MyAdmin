package com.ruoyi.order.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * bd_order
 * @author 
 */
public class BdOrder implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String modifier;

    private String creator;

    private String isDeleted;

    private String mailNo;

    private String outBizNo;

    private String fromProvince;

    private String fromCity;

    private String fromArea;

    private String fromAddress;

    private String toProvince;

    private String toCity;

    private String toArea;

    private String toAddress;

    private String receiverPhone;

    private String cleanAddress;

    private String heka;

    private String deliveryDate;

    private String deliveryType;

    private String distributor;

    private String distributorNum;

    private String status;

    private Long price;

    private String img;

    private String isPrint;

    private String sender;

    private String clientName;

    private String tenantCode;

    private String sortingNo;

    private String senderPhone;

    private Float orderPrice;

    private Float deliveryCost;

    private String detail;

    private Float lng;

    private Float lat;

    private String orderSource;

    private String addressUnit;

    /**
     * 支付状态(y/n)
     */
    private String payStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getMailNo() {
        return mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getFromProvince() {
        return fromProvince;
    }

    public void setFromProvince(String fromProvince) {
        this.fromProvince = fromProvince;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromArea() {
        return fromArea;
    }

    public void setFromArea(String fromArea) {
        this.fromArea = fromArea;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToProvince() {
        return toProvince;
    }

    public void setToProvince(String toProvince) {
        this.toProvince = toProvince;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getToArea() {
        return toArea;
    }

    public void setToArea(String toArea) {
        this.toArea = toArea;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getCleanAddress() {
        return cleanAddress;
    }

    public void setCleanAddress(String cleanAddress) {
        this.cleanAddress = cleanAddress;
    }

    public String getHeka() {
        return heka;
    }

    public void setHeka(String heka) {
        this.heka = heka;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDistributorNum() {
        return distributorNum;
    }

    public void setDistributorNum(String distributorNum) {
        this.distributorNum = distributorNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getSortingNo() {
        return sortingNo;
    }

    public void setSortingNo(String sortingNo) {
        this.sortingNo = sortingNo;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public Float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Float getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(Float deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getAddressUnit() {
        return addressUnit;
    }

    public void setAddressUnit(String addressUnit) {
        this.addressUnit = addressUnit;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BdOrder other = (BdOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getMailNo() == null ? other.getMailNo() == null : this.getMailNo().equals(other.getMailNo()))
            && (this.getOutBizNo() == null ? other.getOutBizNo() == null : this.getOutBizNo().equals(other.getOutBizNo()))
            && (this.getFromProvince() == null ? other.getFromProvince() == null : this.getFromProvince().equals(other.getFromProvince()))
            && (this.getFromCity() == null ? other.getFromCity() == null : this.getFromCity().equals(other.getFromCity()))
            && (this.getFromArea() == null ? other.getFromArea() == null : this.getFromArea().equals(other.getFromArea()))
            && (this.getFromAddress() == null ? other.getFromAddress() == null : this.getFromAddress().equals(other.getFromAddress()))
            && (this.getToProvince() == null ? other.getToProvince() == null : this.getToProvince().equals(other.getToProvince()))
            && (this.getToCity() == null ? other.getToCity() == null : this.getToCity().equals(other.getToCity()))
            && (this.getToArea() == null ? other.getToArea() == null : this.getToArea().equals(other.getToArea()))
            && (this.getToAddress() == null ? other.getToAddress() == null : this.getToAddress().equals(other.getToAddress()))
            && (this.getReceiverPhone() == null ? other.getReceiverPhone() == null : this.getReceiverPhone().equals(other.getReceiverPhone()))
            && (this.getCleanAddress() == null ? other.getCleanAddress() == null : this.getCleanAddress().equals(other.getCleanAddress()))
            && (this.getHeka() == null ? other.getHeka() == null : this.getHeka().equals(other.getHeka()))
            && (this.getDeliveryDate() == null ? other.getDeliveryDate() == null : this.getDeliveryDate().equals(other.getDeliveryDate()))
            && (this.getDeliveryType() == null ? other.getDeliveryType() == null : this.getDeliveryType().equals(other.getDeliveryType()))
            && (this.getDistributor() == null ? other.getDistributor() == null : this.getDistributor().equals(other.getDistributor()))
            && (this.getDistributorNum() == null ? other.getDistributorNum() == null : this.getDistributorNum().equals(other.getDistributorNum()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getIsPrint() == null ? other.getIsPrint() == null : this.getIsPrint().equals(other.getIsPrint()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getTenantCode() == null ? other.getTenantCode() == null : this.getTenantCode().equals(other.getTenantCode()))
            && (this.getSortingNo() == null ? other.getSortingNo() == null : this.getSortingNo().equals(other.getSortingNo()))
            && (this.getSenderPhone() == null ? other.getSenderPhone() == null : this.getSenderPhone().equals(other.getSenderPhone()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getDeliveryCost() == null ? other.getDeliveryCost() == null : this.getDeliveryCost().equals(other.getDeliveryCost()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getLng() == null ? other.getLng() == null : this.getLng().equals(other.getLng()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getOrderSource() == null ? other.getOrderSource() == null : this.getOrderSource().equals(other.getOrderSource()))
            && (this.getAddressUnit() == null ? other.getAddressUnit() == null : this.getAddressUnit().equals(other.getAddressUnit()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getMailNo() == null) ? 0 : getMailNo().hashCode());
        result = prime * result + ((getOutBizNo() == null) ? 0 : getOutBizNo().hashCode());
        result = prime * result + ((getFromProvince() == null) ? 0 : getFromProvince().hashCode());
        result = prime * result + ((getFromCity() == null) ? 0 : getFromCity().hashCode());
        result = prime * result + ((getFromArea() == null) ? 0 : getFromArea().hashCode());
        result = prime * result + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        result = prime * result + ((getToProvince() == null) ? 0 : getToProvince().hashCode());
        result = prime * result + ((getToCity() == null) ? 0 : getToCity().hashCode());
        result = prime * result + ((getToArea() == null) ? 0 : getToArea().hashCode());
        result = prime * result + ((getToAddress() == null) ? 0 : getToAddress().hashCode());
        result = prime * result + ((getReceiverPhone() == null) ? 0 : getReceiverPhone().hashCode());
        result = prime * result + ((getCleanAddress() == null) ? 0 : getCleanAddress().hashCode());
        result = prime * result + ((getHeka() == null) ? 0 : getHeka().hashCode());
        result = prime * result + ((getDeliveryDate() == null) ? 0 : getDeliveryDate().hashCode());
        result = prime * result + ((getDeliveryType() == null) ? 0 : getDeliveryType().hashCode());
        result = prime * result + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        result = prime * result + ((getDistributorNum() == null) ? 0 : getDistributorNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getIsPrint() == null) ? 0 : getIsPrint().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getTenantCode() == null) ? 0 : getTenantCode().hashCode());
        result = prime * result + ((getSortingNo() == null) ? 0 : getSortingNo().hashCode());
        result = prime * result + ((getSenderPhone() == null) ? 0 : getSenderPhone().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getDeliveryCost() == null) ? 0 : getDeliveryCost().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getLng() == null) ? 0 : getLng().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getOrderSource() == null) ? 0 : getOrderSource().hashCode());
        result = prime * result + ((getAddressUnit() == null) ? 0 : getAddressUnit().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", modifier=").append(modifier);
        sb.append(", creator=").append(creator);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", mailNo=").append(mailNo);
        sb.append(", outBizNo=").append(outBizNo);
        sb.append(", fromProvince=").append(fromProvince);
        sb.append(", fromCity=").append(fromCity);
        sb.append(", fromArea=").append(fromArea);
        sb.append(", fromAddress=").append(fromAddress);
        sb.append(", toProvince=").append(toProvince);
        sb.append(", toCity=").append(toCity);
        sb.append(", toArea=").append(toArea);
        sb.append(", toAddress=").append(toAddress);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", cleanAddress=").append(cleanAddress);
        sb.append(", heka=").append(heka);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", distributor=").append(distributor);
        sb.append(", distributorNum=").append(distributorNum);
        sb.append(", status=").append(status);
        sb.append(", price=").append(price);
        sb.append(", img=").append(img);
        sb.append(", isPrint=").append(isPrint);
        sb.append(", sender=").append(sender);
        sb.append(", clientName=").append(clientName);
        sb.append(", tenantCode=").append(tenantCode);
        sb.append(", sortingNo=").append(sortingNo);
        sb.append(", senderPhone=").append(senderPhone);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", deliveryCost=").append(deliveryCost);
        sb.append(", detail=").append(detail);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", orderSource=").append(orderSource);
        sb.append(", addressUnit=").append(addressUnit);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}