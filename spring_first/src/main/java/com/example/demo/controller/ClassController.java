package com.example.demo.controller;

import com.example.demo.component.FileComponent;
import com.example.demo.component.UserComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @Autowired
    FileComponent fileComponent;

    @RequestMapping("hello/file")
    public FileComponent filePath(){

        return fileComponent;
    }

    @Autowired
    UserComponent userComponent;
    @RequestMapping("hello/user")
    public UserComponent method(){

        return userComponent;
    }



}
