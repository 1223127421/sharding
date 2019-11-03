package com.wang.controller;

import com.wang.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @RequestMapping("/insertOrder")
    public String insertOrder() {
        orderDao.insertOrder(new BigDecimal(123), 1l, "success");
        return "insertOrder";
    }

    @RequestMapping("/list")
    public String list() {
        return orderDao.list().toString();
    }
}
