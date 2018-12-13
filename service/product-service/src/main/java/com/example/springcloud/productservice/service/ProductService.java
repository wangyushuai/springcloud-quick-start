package com.example.springcloud.productservice.service;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

import com.example.springcloud.commondomain.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    /**
     * 根据Id查询商品
     * @param id
     * @return
     */
    Product findById(int id);
}
