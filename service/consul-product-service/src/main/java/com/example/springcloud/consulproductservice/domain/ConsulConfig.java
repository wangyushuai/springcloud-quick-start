package com.example.springcloud.consulproductservice.domain;

import com.example.springcloud.util.json.JsonUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wangyushuai2@jd.com
 * @date 2019/4/25
 */
@Component
@ConfigurationProperties(prefix = "test.config")
public class ConsulConfig {
    private String name = "local";
    private String prefix = "local";
    private String profiles = "local";

    /**
     * 从全局配置中读取
      */
    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return JsonUtils.obj2String(this);
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
