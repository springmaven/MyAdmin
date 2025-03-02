package com.ruoyi.service.partner;

import com.ruoyi.domain.partner.PartnerContext;
import com.ruoyi.domain.partner.PartnerInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 承运商决策
 */
@Component
public class PartnerFactory {
    /**
     * 决策链
     */
    List<PartnerDecision> partnerDecisionList;

    /**
     * 决策可用CP
     * @return
     */
    public List<PartnerInfo> vailablePartners(PartnerContext context){
        // 参数校验
        if(Objects.isNull(context)){
            return null;
        }
        List<PartnerInfo> partnerInfos = new ArrayList<>();
        /**
         *获取配送商
         */
        for (PartnerDecision partnerDecision : partnerDecisionList) {
            if(partnerDecision.suit(context)){
                //装配信息
                partnerInfos.add(partnerDecision.getPartnerInfo(context));
            }
        }
        /**
         * 黑名单过滤
         */

       return partnerInfos;
    }

}
