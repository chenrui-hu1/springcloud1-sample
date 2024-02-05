package com.wilfcode.service.impl;

import com.alibaba.fastjson.JSON;
import com.wilfcode.dao.OrderDao;
import com.wilfcode.domain.Order;
import com.wilfcode.domain.Product;
import com.wilfcode.feign.ProductFeignApi;
import com.wilfcode.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderDao orderDao;
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeignApi productFeignApi;
    @Override
    public Order createOrder(Long productId, Long userId) {
        log.info("create order start and pid={}, number={}", productId, userId);

//        String url = "http://localhost:8081/product/" + productId;

//        String url = "http://product-service/product/" + productId;


//        log.info("url={}", url);




//        Product product = restTemplate.getForObject(url, Product.class);
        Product product = productFeignApi.findById(productId);
        log.info(("class={}" + product.getClass()));
        log.info("product={}", JSON.toJSONString(product));



        Order order = new Order();
        order.setUid(userId);
        order.setUsername("wilfcode");

        order.setPid(productId);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        orderDao.save(order);

        log.info("create order end and order={}", JSON.toJSONString(order));

        return order;


    }
}
