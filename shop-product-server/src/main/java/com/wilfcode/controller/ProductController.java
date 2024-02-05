package com.wilfcode.controller;

import com.alibaba.fastjson.JSON;
import com.wilfcode.domain.Product;
import com.wilfcode.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class ProductController {

    @Autowired
    private IProductService productService;

    @Value("${server.port}")
    private String port;


    @RequestMapping("/product/{pid}")
    public Product findById(@PathVariable("pid") Long pid) {
        log.info("product-service findById() is called");
        Product product = productService.findById(pid);
        product.setPname(product.getPname() + " data from port=" + port);
        log.info("product-service findById() is completed, content is :{}", JSON.toJSONString(product));
        return product;

    }
}
