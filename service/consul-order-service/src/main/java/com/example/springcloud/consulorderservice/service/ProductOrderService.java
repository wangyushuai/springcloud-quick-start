package com.example.springcloud.consulorderservice.service;

/**
 * Created by wangyushuai@fang.com on 2018/12/12.
 */
public interface ProductOrderService {
    /**
     * 产品服务名
     */
    String PRODUCT_SERVICE_NAME = "consul-product-service";

    /**
     * 产品详情路径
     */
    String PRODUCT_SERVICE_NAME_PRODUCT_DETAIL_PATH = "api/v1/product_detail";

    /**
     * 根据Id查询商品
     * @param productId
     * @param userId
     * @return
     */
     boolean save(int productId, int userId);
}
