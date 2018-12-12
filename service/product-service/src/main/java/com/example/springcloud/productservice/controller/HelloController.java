package com.example.springcloud.productservice.controller;

import com.example.springcloud.util.response.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@RestController
public class HelloController {

    @RequestMapping({"/","/api/v1/hello"})
    public RestResponse hello() {
        return RestResponse.buildSuccess("welcome to product service");
    }
}

