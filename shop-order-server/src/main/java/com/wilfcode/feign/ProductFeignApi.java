package com.wilfcode.feign;

import com.wilfcode.domain.Product;
import com.wilfcode.feign.fallback.ProductFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service", fallback = ProductFeignClientFallback.class)

public interface ProductFeignApi {
    @RequestMapping("/product/{pid}")
    Product findById(@PathVariable("pid")  Long pid);
}
