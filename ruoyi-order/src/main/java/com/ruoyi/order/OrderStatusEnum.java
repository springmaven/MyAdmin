package com.ruoyi.order;

/**
 * Created by liangjun on 2020/10/17.
 */
public enum OrderStatusEnum {

    WAIT_ACCEPT("1","WAIT_ACCEPT","待接单"),
    WAIT_PICKUP("2","WAIT_PICKUP","待取货"),
    DEVLIVERYING("3","DEVLIVERYING","配送中"),
    SIGNED("4","SIGNED","已完成"),
    CANCELED("5","CANCELED","已取消"),
    TRANSFER_ORDER("8","TRANSFER_ORDER","指派单"),
    DELIVERY_EXCEPTION("9","DELIVERY_EXCEPTION","妥投异常之物品返回中"),
    DELIVERY_EXCEPTION_FINISHED("10","DELIVERY_EXCEPTION_FINISHED","妥投异常之物品返回完成"),
    HORSEMAN_IN_SHOP("100","HORSEMAN_IN_SHOP","骑士到店"),
    CREATE_ORDER_ERROR("1000","CREATE_ORDER_ERROR","创建达达运单失败");

    private String key ;
    private String value;
    private String desc;

    public String getKey() {
        return key;
    }


    public String getValue() {
        return value;
    }


    public String getDesc() {
        return desc;
    }


    OrderStatusEnum(String key, String value, String desc){
        this.key=key;
        this.value=value;
        this.desc=desc;

    }
    public static OrderStatusEnum getInstanceByKey(String key){
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if(orderStatusEnum.getKey().equals(key)){
                return orderStatusEnum;
            }
        }
        return OrderStatusEnum.WAIT_ACCEPT;
    }



    public static OrderStatusEnum getInstanceByValue(String value){
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if(orderStatusEnum.getValue().equals(value)){
                return orderStatusEnum;
            }
        }
        return OrderStatusEnum.WAIT_ACCEPT;
    }


}
