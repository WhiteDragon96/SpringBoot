package com.example.third.web;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


/*
* 注册组件
* */
@Component
public class HelloFilter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter3");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
