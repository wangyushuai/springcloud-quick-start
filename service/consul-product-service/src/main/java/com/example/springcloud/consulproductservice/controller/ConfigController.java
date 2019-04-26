package com.example.springcloud.consulproductservice.controller;

import com.example.springcloud.consulproductservice.domain.ConsulConfig;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取Consul Config Demo
 * @author wangyushuai2@jd.com
 * @date 2019/4/25
 */
@RestController
@RequestMapping("/v1/config")
public class ConfigController {

    @Value("${test.config.name:local}")
    private String appName;

//    @Value("${test.config.context}")
//    private String context;

    @Autowired
    ConsulConfig consulConfig;

    @GetMapping({"/",""})
    public RestResponse HelloWorld() {
        return RestResponse.buildSuccess("hello wolrd");
    }

    /**
     * 返回从consul 配置中心获取到的配置（appName）
     * @return
     */
    @GetMapping("/app_name")
    public RestResponse describeAppName() {
        return RestResponse.buildSuccess(appName);
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
