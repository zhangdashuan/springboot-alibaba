package com.sidianle.service;

import com.sidianle.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-product")
public interface ProductServiceClient {

    @RequestMapping("/product/product/{pid}")
    Product findByPid(@PathVariable Integer pid);

}
