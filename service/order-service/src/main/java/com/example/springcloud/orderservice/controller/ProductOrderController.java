package com.example.springcloud.orderservice.controller;

import com.example.springcloud.orderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@RestController
@RequestMapping("/api/v1/product-order")
public class ProductOrderController {

    @Autowired
    ProductOrderService productOrderService;

    @HystrixCommand(fallbackMethod = "productOrderFail")
    @PostMapping("/save")
    public RestResponse save(@RequestParam("product-id") int productId,@RequestParam("user-id") int userId) {
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
        return RestResponse.buildError_ServiceUnavailable("订单服务已熔断部分请求");
    }


}
