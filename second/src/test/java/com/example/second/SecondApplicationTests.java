package com.example.second;

import com.example.second.componet.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecondApplicationTests {

    @Autowired

    User user;
    @Test
    void contextLoads() {
         System.out.println(user);
    }

}
