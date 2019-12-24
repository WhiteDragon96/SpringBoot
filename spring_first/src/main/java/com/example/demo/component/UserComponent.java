package com.example.demo.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "cs.user")
public class UserComponent {

    String username;
    int age;
    boolean married;
    Map<String,String> map;
    List<String> list;
    UserDetail userDetail;
}
