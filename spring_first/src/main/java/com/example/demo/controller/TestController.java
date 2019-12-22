package com.example.demo.controller;

import com.example.demo.bean.*;
import com.example.demo.mapper.Cnarea2018Mapper;
import com.example.demo.mapper.PoetriesMapper;
import com.example.demo.service.Cnarea2018Service;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public List method(){
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
        return allUser;
    }
    @Autowired
    Cnarea2018Service cnarea2018Service;
    @RequestMapping("user/login")
    public List<Cnarea2018> login(){
        Cnarea2018Example cnarea2018Example = new Cnarea2018Example();
        cnarea2018Example.createCriteria().andNameLike("%" + "南宁" + "%");
        List<Cnarea2018> cnarea2018s = cnarea2018Service.selectByExample(cnarea2018Example);

        return cnarea2018s;
    }

    @RequestMapping("user/register")
    public List<User> register(){
        List<User> userList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setAge(i*i);
            user.setUsername("i: "+ i );
            user.setPassword("password: " + i*i);
            userList.add(user);
        }
        List<User> userList1 = userService.insertUser(userList);
        System.out.println("33333344422134433");
        System.out.println("33333344422134433");
        return userList;
    }

    @Autowired
    PoetriesMapper poetriesMapper;
    @RequestMapping("user/select")
    public List<Poetries> select(){
        PoetriesExample poetriesExample = new PoetriesExample();
        List<Poetries> poetries = poetriesMapper.selectByExample(poetriesExample);
        return poetries;
    }
    //获取用户所有信息包括detail、orders
    @RequestMapping("user/getUserAll")
    public User selectUser(){
        User user = userService.selectUserById(5);
        System.out.println(user);
        return user;
    }

}
