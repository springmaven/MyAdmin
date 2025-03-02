package com.ruoyi.service.partner;

import com.ruoyi.domain.partner.PartnerContext;
import com.ruoyi.domain.partner.PartnerInfo;

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

    /**
     * 获取配送商信息
     *
     * @return
     */
    PartnerInfo getPartnerInfo(PartnerContext context);
}
