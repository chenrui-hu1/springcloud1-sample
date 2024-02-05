package com.wilfcode.feign.fallback;

import com.wilfcode.domain.Product;
import com.wilfcode.feign.ProductFeignApi;

public class ProductFeignClientFallback implements ProductFeignApi {
    @Override
    public Product findById(Long pid) {
        System.out.println("fallback");
        Product product = new Product();
        return product;

    }
}
