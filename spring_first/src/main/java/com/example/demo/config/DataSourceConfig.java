package com.example.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "demo.db")
public class DataSourceConfig {

    String driverClassName;

    String url;

    String username;

    String password;
}
