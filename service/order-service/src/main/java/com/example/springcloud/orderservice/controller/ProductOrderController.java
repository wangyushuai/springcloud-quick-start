package com.example.springcloud.orderservice.controller;

import com.example.springcloud.orderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@RestController
@RequestMapping("/api/v1/product-order")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;


    @PostMapping("/save")
    public RestResponse save(@RequestParam("product-id") int productId,@RequestParam("user-id") int userId) {
        boolean result = productOrderService.save(productId,userId);
        return RestResponse.buildSuccess(result);
    }

    @GetMapping("/save")
    public RestResponse save(@RequestParam("product-id") int productId) {
        int userId = 0;
        boolean result = productOrderService.save(productId,userId);
        return RestResponse.buildSuccess(result);
    }

    /**
     * 熔断兜底函数
     * @param productId
     * @param userId
     * @return
     */
    private RestResponse productOrderFail(int productId,int userId) {
        System.out.println("订单请求已熔断");
        return RestResponse.buildError_ServiceUnavailable("订单服务已熔断部分请求");
    }


}
