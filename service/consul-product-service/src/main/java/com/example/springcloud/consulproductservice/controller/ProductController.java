package com.example.springcloud.consulproductservice.controller;

import com.example.springcloud.util.response.RestResponse;
import org.springframework.web.bind.annotation.*;

/**
 * 产品服务
 * @author wangyushuai2@jd.com
 * @date 2019/4/23
 */
@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @GetMapping("/product_detail/{productId}")
    public RestResponse describeProductDetail(@PathVariable("productId") Integer productId) {
        String data = String.format("consul-product-service-> product: %s",productId);
        return RestResponse.buildSuccess(data);
    }
}
