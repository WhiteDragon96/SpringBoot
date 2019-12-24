package com.example.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.third.web")
public class ThirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdApplication.class, args);
    }

}
