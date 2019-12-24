package com.example.second.controller;

import com.example.second.componet.FileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

    @RequestMapping("hello3")
    public Model hello(Model model){
        model.addAttribute("hello.jsp");
        return model;
    }

    @Autowired
    FileConfig fileConfig;
    @RequestMapping("/hello/world")
    public FileConfig hello2(){
        return fileConfig;
    }
}
