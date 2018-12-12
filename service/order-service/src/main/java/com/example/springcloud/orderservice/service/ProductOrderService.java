package com.example.springcloud.orderservice.service;

import org.springframework.stereotype.Service;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@Service
public interface ProductOrderService {
    /**
     * 根据Id查询商品
     * @param productId
     * @param userId
     * @return
     */
     boolean save(int productId,int userId);
}
