package com.tcs.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice//异常通知器
public class AppWithExceptionHandler {//定义控制器类
    @ExceptionHandler(ArithmeticException.class)//定义异常类处理方法
    public String byzero(){
        return "b.jpg";
    }
    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map myException(MyException e) {
        e.printStackTrace();
        HashMap<String,String> map = new HashMap<>();
        map.put("name","error");
        System.out.println("error");
        return map;
    }
}
