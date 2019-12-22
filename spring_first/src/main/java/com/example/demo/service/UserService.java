package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    List<User> insertUser(List<User> userList);


    User selectUserById(int id);
}
