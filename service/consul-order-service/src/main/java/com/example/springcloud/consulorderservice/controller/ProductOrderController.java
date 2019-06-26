package com.example.springcloud.consulorderservice.controller;

import com.example.springcloud.consulorderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品订单服务
 * @author wangyushuai2@jd.com
 * @date 2019/4/25
 */

@RestController
@RequestMapping("/api/v1/product-order")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;


    @PostMapping("/save")
    public RestResponse save(@RequestParam("productId") Integer productId,@RequestParam("userId") Integer userId) {
        boolean result = productOrderService.save(productId,userId);
        return RestResponse.buildSuccess(result);
    }

    @GetMapping("/save")
    public RestResponse save(@RequestParam("productId") Integer productId) {
        int userId = 0;
        boolean result = productOrderService.save(productId,userId);
        return RestResponse.buildSuccess(result);
    }


}
