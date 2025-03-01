package com.ruoyi.order.service;

import com.ruoyi.order.domain.BdOrder;

import java.util.List;

/**
 * Created by liangjun on 2020/8/29.
 */
public interface BdOrderService {

    public int createBdOrder(BdOrder bdOrder);

    public List<BdOrder> queryOrderByOutBizCode(String tenantCode, String outBizCode);

    public List<BdOrder> queryOrder(BdOrder param);

    public BdOrder queryById(Long id);

    public int updateBdOrder(BdOrder bdOrder);
}