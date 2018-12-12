package com.example.springcloud.orderservice.controller;

import com.example.springcloud.orderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@RestController
@RequestMapping("/api/v1/")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;

    @PostMapping("/save")
    public RestResponse save(@RequestParam("product-id") int productId,@RequestParam("user-id") int userId) {
        return RestResponse.buildSuccess(productOrderService.save(productId,userId));
    }
}
