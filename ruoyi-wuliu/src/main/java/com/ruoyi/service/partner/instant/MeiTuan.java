package com.ruoyi.service.partner.instant;

import com.ruoyi.domain.partner.PartnerContext;
import com.ruoyi.domain.partner.PartnerInfo;
import com.ruoyi.service.partner.PartnerDecision;
import org.springframework.stereotype.Component;

/**
 * 美团决策类
 */
@Component
public class MeiTuan implements PartnerDecision {

    @Override
    public Boolean suit(PartnerContext context) {
        return null;
    }

    @Override
    public PartnerInfo getPartnerInfo(PartnerContext context) {
        return null;
    }
}
