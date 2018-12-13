package com.example.springcloud.orderservice.service.impl;

import com.example.springcloud.orderservice.service.ProductOrderService;
import org.springframework.stereotype.Service;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {


    @Override
    public boolean save(int productId, int userId) {
        return false;
    }
}
