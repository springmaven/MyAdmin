package com.ruoyi.plugin;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 插件管理核心基类
 */
public class PluginManager {
    private static Logger LOGGER= LoggerFactory.getLogger(PluginManager.class);

    private final Map<String, BasePlugin> pluginMap = new ConcurrentHashMap<>();

    public void loadAndCachePlugin(PluginInfo pluginInfo) {
        // 参数校验
        if (pluginInfo == null || StringUtils.isEmpty(pluginInfo.getPluginCode())) {
            throw new IllegalArgumentException("Invalid PluginInfo");
        }
        String pluginCode = pluginInfo.getPluginCode();
        String pluginUrl = pluginInfo.getPluginPath().toString();

        // 加载插件实例
        try {
            BasePlugin pluginInstance = PluginLoadUtil.getPluginInstance(pluginUrl);
            // 线程安全写入缓存
            synchronized (pluginMap) {
                pluginMap.putIfAbsent(pluginCode, pluginInstance);
            }
        } catch (Exception e) {
            LOGGER.error("Failed to load plugin: " + pluginCode, e);
        }
    }

}
