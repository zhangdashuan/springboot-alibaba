package com.sidianle.controller;

import com.sidianle.domain.Order;
import com.sidianle.domain.Product;
import com.sidianle.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/create/{pid}")
    public void createOrder(@PathVariable("pid") Integer pid) {
        log.info("createOrder >> 创建订单 >> pid = {}", pid);
        // step1: 查询商品
        Product product = restTemplate.getForObject("http://localhost:8081/product/product/" + pid, Product.class);
        log.info("getForObject >> 查询商品信息 >> product = {}", product);
        // step2: 创建订单
        Order order = new Order();
        order.setUid(1);
        order.setNumber(1);
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setUsername("测试用户");
        orderService.createOrder(order);
    }
}
