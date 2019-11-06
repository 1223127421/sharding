package com.wang.controller;

import com.wang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/listUser")
    public String listUser() {
        return userDao.listUser().toString();
    }

    @RequestMapping("/insertUser")
    public String insertUser() {
        userDao.insertUser("admin");
        return "insertUser";
    }

}