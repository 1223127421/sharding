package com.wang.controller;

import com.wang.dao.OrderDao;
import com.wang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/fenku")
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @Autowired
    UserDao userDao;

    @RequestMapping("/insertOrder")
    public String insertOrder() {
        orderDao.insertOrder(new BigDecimal(123), 1l, "success");
        orderDao.insertOrder(new BigDecimal(123), 1l, "success");
        orderDao.insertOrder(new BigDecimal(123), 2l, "success");
        orderDao.insertOrder(new BigDecimal(123), 2l, "success");
        return "insertOrder";
    }

    @RequestMapping("/list")
    public String list() {
        return orderDao.list().toString();
    }

    @RequestMapping("/insertUser")
    public String insertUser() {
        userDao.insertUser("admin");
        return "insertUser";
    }
}