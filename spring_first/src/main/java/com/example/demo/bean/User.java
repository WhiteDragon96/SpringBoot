package com.example.demo.bean;

import lombok.Data;

import java.util.List;

@Data

public class User {
    /**
     * id
     */
    private Integer id;

    /**
     * password
     */
    private String password;

    /**
     * username
     */
    private String username;

    /**
     * sex
     */
    private String sex;

    private Integer age;

    UserDetailT userDetail;

    List<UserOrderT> orderList;
}
