package com.ruoyi.plugin;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
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
            BasePlugin pluginInstance = getPluginInstance(pluginUrl);
            // 线程安全写入缓存
            synchronized (pluginMap) {
                pluginMap.putIfAbsent(pluginCode, pluginInstance);
            }
        } catch (Exception e) {
            LOGGER.error("Failed to load plugin: " + pluginCode, e);
        }
    }

    // 单例模式（线程安全）
    private static volatile URLClassLoader classLoader;

    /**
     * 获取单例类加载器实例
     * @param jarUrl 远程 JAR 地址
     * @return URLClassLoader 实例
     */
    public static URLClassLoader getClassLoader(String jarUrl) {
        if (classLoader == null) {
            synchronized (PluginManager.class) {
                if (classLoader == null) {
                    try {
                        // 创建空类加载器（需反射调用 addURL）
                        classLoader = new URLClassLoader(new URL[]{new URL(jarUrl)},ClassLoader.getSystemClassLoader());
                        Method addUrlMethod = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
                        addUrlMethod.setAccessible(true);
                        addUrlMethod.invoke(classLoader, new URL(jarUrl));
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to load remote JAR: " + jarUrl, e);
                    }
                }
            }
        }
        return classLoader;
    }

    /**
     * 获取 JAR 包中指定类的实例
     * @param className 全限定类名（如 com.example.PluginImpl）
     * @return 类实例
     */
    public static <T> T getPluginInstance(String className) {
        try {
            Class<?> clazz = classLoader.loadClass(className);
            return (T) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate class: " + className, e);
        }
    }

}
