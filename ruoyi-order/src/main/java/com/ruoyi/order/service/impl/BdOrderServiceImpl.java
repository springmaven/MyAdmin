package com.ruoyi.order.service.impl;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.order.OrderStatusEnum;
import com.ruoyi.order.domain.BdOrder;
import com.ruoyi.order.domain.BdOrderExample;
import com.ruoyi.order.mapper.BdOrderMapper;
import com.ruoyi.order.service.BdOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by liangjun on 2020/8/29.
 */
@Service
public class BdOrderServiceImpl implements BdOrderService {

    @Autowired
    private BdOrderMapper bdOrderMapper;

    public int createBdOrder(BdOrder bdOrder) {

        bdOrder.setGmtModified(new Date());
        bdOrder.setGmtCreate(new Date());
        bdOrder.setIsDeleted("n");
        bdOrder.setModifier("sys");
        bdOrder.setStatus(OrderStatusEnum.WAIT_ACCEPT.getValue());
        bdOrder.setCreator("sys");
        return bdOrderMapper.insert(bdOrder);

    }

    @Override
    public BdOrder queryById(Long id) {
        return bdOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BdOrder> queryOrderByOutBizCode(String tenantCode, String outBizCode) {
        BdOrderExample bdOrderExample=new BdOrderExample();
        bdOrderExample.createCriteria().andOutBizNoEqualTo(outBizCode).andTenantCodeEqualTo(tenantCode);
        return bdOrderMapper.selectByExample(bdOrderExample);

    }

    @Override
    public List<BdOrder> queryOrder(BdOrder queryParam) {
        BdOrderExample bdOrderExample=new BdOrderExample();
        BdOrderExample.Criteria criteria=bdOrderExample.createCriteria();
        if(StringUtils.isNotEmpty(queryParam.getOutBizNo())){
            criteria.andOutBizNoEqualTo(queryParam.getOutBizNo());
        }
        if(StringUtils.isNotEmpty(queryParam.getClientName())){
            criteria.andClientNameEqualTo(queryParam.getClientName());
        }
        if(StringUtils.isNotEmpty(queryParam.getReceiverPhone())){
            criteria.andReceiverPhoneEqualTo(queryParam.getReceiverPhone());
        }
        if(StringUtils.isNotEmpty(queryParam.getAddressUnit())){
            criteria.andAddressUnitLike("%"+queryParam.getAddressUnit()+"%");
        }
        if(StringUtils.isNotEmpty(queryParam.getStatus())){
            criteria.andStatusEqualTo(queryParam.getStatus());
        }
        if(StringUtils.isNotEmpty(queryParam.getOrderSource())){
            criteria.andOrderSourceEqualTo(queryParam.getOrderSource());
        }
        return bdOrderMapper.selectByExample(bdOrderExample);
    }

    @Override
    public int updateBdOrder(BdOrder bdOrder) {
        return bdOrderMapper.updateByPrimaryKey(bdOrder);
    }
}

