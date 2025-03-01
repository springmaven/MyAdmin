package com.ruoyi.adapter;

import com.alibaba.fastjson.JSON;
import com.ruoyi.client.DadaApiResponse;
import com.ruoyi.client.DadaRequestClient;
import com.ruoyi.config.AppConfig;
import com.ruoyi.domain.merchant.ShopAddModel;
import com.ruoyi.service.merchant.ShopAddService;
import com.ruoyi.utils.JSONUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangjun on 2020/10/25.
 */
public class HZShopAdapter {

    private  DadaApiResponse addShop() {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        ShopAddModel shopAddModel = new ShopAddModel();
        // 根据实际信息来填写门店地址
        shopAddModel.setOriginShopId("BDHD-WDH");
        shopAddModel.setStationName("缤朵花店");
        shopAddModel.setBusiness(2);
        shopAddModel.setCityName("杭州");
        shopAddModel.setAreaName("滨江区");
        shopAddModel.setStationAddress("古塘路31-3");
        shopAddModel.setLng(BigDecimal.valueOf(120.22554));
        shopAddModel.setLat(BigDecimal.valueOf(30.191198));
        shopAddModel.setContactName("王丹花");
        shopAddModel.setPhone("17682315804");

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        List<ShopAddModel> shopAddList = new ArrayList<ShopAddModel>();
        shopAddList.add(shopAddModel);
        ShopAddService shopAddService = new ShopAddService(JSONUtil.toJson(shopAddList));


        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(shopAddService, appConfig);
        return dadaClient.callRpc();
    }

    public static void main(String[] args) {
        System.out.printf(JSON.toJSONString(new HZShopAdapter().addShop()));
    }
}
