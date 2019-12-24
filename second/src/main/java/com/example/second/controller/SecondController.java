package com.example.second.controller;

import com.example.second.componet.User;
import com.example.second.componet.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @Autowired
    User user;
    @RequestMapping("hello")
    public User method(){
        UserDetail userDetail = user.getUserDetail();
        System.out.println(userDetail);
        return user;
    }
}
