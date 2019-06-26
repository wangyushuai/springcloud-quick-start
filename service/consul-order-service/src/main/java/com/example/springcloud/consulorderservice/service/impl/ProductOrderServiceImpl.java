package com.example.springcloud.consulorderservice.service.impl;

import com.example.springcloud.consulorderservice.service.ProductOrderService;
import com.example.springcloud.util.response.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 商品订单服务
 * Created by wangyushuai@fang.com on 2018/12/12.
 */

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    private final static Logger logger = LoggerFactory.getLogger(ProductOrderServiceImpl.class);

    @Autowired
    RestTemplate restTemplate;
    /**
     * 订单保存
     * 保存时，根据productId 读取商品信息
     * @param productId
     * @param userId
     * @return
     */
    @Override
    public boolean save(int productId, int userId) {
        String url = String.format("http://%s/%s/%s",PRODUCT_SERVICE_NAME,PRODUCT_SERVICE_NAME_PRODUCT_DETAIL_PATH,productId);
//        参数
//        Map<String,Integer> params = new HashMap<>(4);
//        params.put("productId",productId);

        // 获取商品信息，并打印
        Object productIno = Optional.ofNullable(restTemplate.getForObject(url, RestResponse.class)).map(RestResponse::getData)
                .orElse("get product detail fail");
        logger.info((String) productIno);

        // 获取用户信息，并打印...


        //此处可以添加保存逻辑....

        return true;
    }


}
