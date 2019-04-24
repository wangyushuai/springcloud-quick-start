package com.example.springcloud.consulproductservice.controller;

import com.example.springcloud.util.response.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyushuai2@jd.com
 * @date 2019/4/23
 */
@RestController
@RequestMapping("/v1")
public class ProductController {

    @RequestMapping("/product_detail")
    public RestResponse describeDetail(@RequestParam Long productId) {
        String data = "consul-producer-product-service";
        return RestResponse.buildSuccess(data);
    }
}
