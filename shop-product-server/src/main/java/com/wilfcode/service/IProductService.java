package com.wilfcode.service;

import com.wilfcode.domain.Product;

public interface IProductService {
    Product findById(Long pid);
}
