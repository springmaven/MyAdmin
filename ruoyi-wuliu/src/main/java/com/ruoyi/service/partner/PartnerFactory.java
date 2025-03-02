package com.ruoyi.service.partner;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.domain.partner.PartnerContext;
import com.ruoyi.domain.partner.PartnerInfo;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 承运商决策
 */
@Component
public class PartnerFactory {
    /**
     * 决策链
     */
    @Autowired
    private List<PartnerDecision> partnerDecisionList;

    @Autowired
    private ISysConfigService configService;

    private static final String PARTNER_BLACK_LIST = "Delivery_Black_List";
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
        String partnerBlackList = configService.selectConfigByKey("PARTNER_BLACK_LIST");
        if(StringUtils.isNotBlank(partnerBlackList)){
            partnerInfos = partnerInfos.stream()
                    .filter(partner -> !partnerBlackList.contains(partner.getCode()))
                    .collect(Collectors.toCollection(ArrayList::new));
        }
        return partnerInfos;
    }

}
