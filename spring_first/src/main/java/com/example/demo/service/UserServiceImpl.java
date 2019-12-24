package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.bean.UserExample;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
    @Transactional//增加事物
    @Override
    public List<User> insertUser(List<User> userList) {
        for (User user : userList) {
            int count = userMapper.insertSelective(user);
            /*int i = 1/0;*/
        }
        return userList;
    }

    @Override
    public User selectUserById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
