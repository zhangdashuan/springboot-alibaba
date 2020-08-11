package com.sidianle.service.impl;

import com.sidianle.dao.ProductDao;
import com.sidianle.domain.Product;
import com.sidianle.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer id) {
        return productDao.findById(id).get();
    }
}
