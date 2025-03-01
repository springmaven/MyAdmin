package com.ruoyi.plugin;

import java.nio.file.Path;

/**
 * 插件信息定义
 */
public class PluginInfo {
    // 基础元数据
    private String pluginCode;       // 插件唯一标识（如 "com.example.myplugin"）
    private String version;        // 语义化版本（如 "1.0.0"）
    private String author;         // 开发者或团队名称
    private String description;    // 插件功能描述

    // 路径与类型
    private Path pluginPath;       // 插件文件路径（如 JAR 或源码目录）
    private PluginType type;       // 类型枚举：JAR

    private boolean isEnabled;     // 启用状态

    // 初始化构造方法
    public PluginInfo(String pluginId, String version, Path pluginPath, PluginType type) {
        this.pluginCode = pluginId;
        this.version = version;
        this.pluginPath = pluginPath;
        this.type = type;
        this.isEnabled = false;
    }

    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Path getPluginPath() {
        return pluginPath;
    }

    public void setPluginPath(Path pluginPath) {
        this.pluginPath = pluginPath;
    }

    public PluginType getType() {
        return type;
    }

    public void setType(PluginType type) {
        this.type = type;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
