package com.work.orders.controllers;


import com.work.orders.models.Customers;
import com.work.orders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServices cstmrsrvcs;

    //http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers(){
        List<Customers> rtnList = cstmrsrvcs.findAllCustomers();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    //http://localhost:2019/customers/customer/7

    //http://localhost:2019/customers/customer/77

    //http://localhost:2019/customers/namelike/mes

    //http://localhost:2019/customers/namelike/cin

    //http://localhost:2019/agents/agent/9

    //http://localhost:2019/orders/order/7

}
