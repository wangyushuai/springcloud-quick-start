package com.example.springcloud.consulorderservice.controller;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 默认服务
 * @author wangyushuai@fang.com
 * @date 2018/12/12
 */

@RestController
public class HelloController {


    @RequestMapping({"/","/hello"})
    public RestResponse hello() {
        return RestResponse.buildSuccess("producer-order-service default api");
    }
}

