package com.ruoyi.plugin;

import java.net.URL;
import java.net.URLClassLoader;
import java.lang.reflect.Method;
/**
 * plugin加载工具
 */
public class PluginLoadUtil {
    // 单例模式（线程安全）
    private static volatile URLClassLoader classLoader;

    /**
     * 获取单例类加载器实例
     * @param jarUrl 远程 JAR 地址
     * @return URLClassLoader 实例
     */
    public static URLClassLoader getClassLoader(String jarUrl) {
        if (classLoader == null) {
            synchronized (PluginLoadUtil.class) {
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
