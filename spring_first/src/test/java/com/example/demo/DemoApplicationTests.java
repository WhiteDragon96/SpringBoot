package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserDetailTMapper;

import com.example.demo.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {
@Autowired
    UserDetailTMapper userDetailTMapper;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
       /* UserDetailT userDetailT = userDetailTMapper.selectByUid(5);
        System.out.println(userDetailT);*/
        User user = userMapper.selectByPrimaryKey(5);


    }

}
