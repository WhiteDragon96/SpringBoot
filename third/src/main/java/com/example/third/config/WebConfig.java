package com.example.third.config;

import com.example.third.web.HelloFilter;
import com.example.third.web.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public ServletRegistrationBean registerationBean(){
        return new ServletRegistrationBean(new HelloServlet(),"/hello/servlet2");
    }
   @Bean
    public FilterRegistrationBean filterRegistrationBean(){
       FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
       filterRegistrationBean.setFilter(new HelloFilter());
        return filterRegistrationBean;
   }


}
