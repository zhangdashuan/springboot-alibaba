package com.sidianle.service.impl;

import com.sidianle.dao.OrderDao;
import com.sidianle.domain.Order;
import com.sidianle.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }
}
