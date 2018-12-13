package com.example.springcloud.orderservice.service.impl;

import com.example.springcloud.commondomain.Product;
import com.example.springcloud.orderservice.service.ProductOrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    private final static String URL_PRODUCT = "http://localhost:8092/api/v1/product/find-by-id";

    @Override
    public boolean save(int productId, int userId) {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(URL_PRODUCT+"?id=" + productId,Product.class);
        return false;
    }
}
