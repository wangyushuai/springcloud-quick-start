package com.example.springcloud.orderservice.service.impl;

import com.example.springcloud.commondomain.Product;
import com.example.springcloud.orderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    private final static String URL_PRODUCT = "http://localhost:8092/api/v1/product/find-by-id";

//    @Autowired
//    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "saveFail")//,commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    @Override
    public boolean save(int productId, int userId) {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(URL_PRODUCT+"?id=" + productId,Product.class);
        return true;
    }

    private boolean saveFail(int productId, int userId) {
        System.out.println("订单请求已熔断");
        return false;
        //return RestResponse.buildError_ServiceUnavailable("订单服务已熔断部分请求");
    }

}
