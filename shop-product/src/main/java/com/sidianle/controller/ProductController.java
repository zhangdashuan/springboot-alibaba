package com.sidianle.controller;

import com.sidianle.domain.Product;
import com.sidianle.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/{pid}")
    public Product getProductById(@PathVariable("pid") Integer pid) {
        log.info("getProductById >> 查询商品 >> pid = {}", pid);
        Product product = productService.getProductById(pid);
        log.info("getProductById >> 查询商品 >> product = {}", product);
        return product;
    }
}
