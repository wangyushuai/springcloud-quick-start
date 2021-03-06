package com.example.springcloud.consulorderservice.controller;

import com.example.springcloud.consulorderservice.domain.ConsulConfig;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取Consul Config Demo（consul 配置测试）
 * @author wangyushuai2@jd.com
 * @date 2019/4/25
 */
@RestController
@RequestMapping("/v1/config")
public class ConfigController {

    @Value("${test.config.name:null}")
    private String appName;

    @Value("${test.config.not.config:null}")
    private String test_notConfig;

    @Autowired
    ConsulConfig consulConfig;

    /**
     * 返回从consul 配置中心获取到的配置（appName）
     * @return
     */
    @GetMapping("/app_name")
    public RestResponse describeAppName() {
        return RestResponse.buildSuccess(appName);
    }


    @GetMapping("/not_config_test")
    public RestResponse describeNotConfig() {
        return RestResponse.buildSuccess(test_notConfig);
    }


    /**
     * 返回从consul 配置中心获取到的所有配置
     * @return
     */
    @GetMapping("/all")
    public RestResponse describeAll() {
        return RestResponse.buildSuccess(consulConfig);
    }


}
