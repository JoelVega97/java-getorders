package com.work.orders.services;

import com.work.orders.models.Orders;
import com.work.orders.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "orderservices")

public class OrderServiceImpl implements OrderServices {

    @Autowired
    OrderRepo ordrepo;

    @Transactional
    @Override
    public Orders save(Orders orders) {
        return ordrepo.save(orders);
    }
}
