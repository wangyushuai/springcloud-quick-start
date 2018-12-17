package com.example.springcloud.productservice.controller;

import com.example.springcloud.productservice.service.ProductService;
import com.example.springcloud.util.response.RestResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 产品服务
 * @author wangyushuai@fang.com
 * @date 2018/12/12
 */

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/find-by-id")
    public RestResponse findById(@RequestParam("id") int id) {
        //模拟id不等于1时的耗时程序
        if(id != 1) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("收到请求商品接口查询！");
        return RestResponse.buildSuccess(productService.findById(id));
    }
}
