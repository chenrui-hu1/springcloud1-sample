package com.wilfcode.service.impl;

import com.wilfcode.dao.ProductDao;
import com.wilfcode.domain.Product;
import com.wilfcode.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findById(Long pid) {
        return productDao.findById(pid).get();
    }
}
