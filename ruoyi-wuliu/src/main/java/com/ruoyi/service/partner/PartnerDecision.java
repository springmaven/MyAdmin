package com.ruoyi.service.partner;

import com.ruoyi.domain.partner.PartnerContext;
import com.ruoyi.domain.partner.PartnerVO;

/**
 * 合作伙伴决策
 */
public interface PartnerDecision {
    /**
     * 决策
     * @param context
     * @return
     */
    Boolean suit(PartnerContext context);
}
