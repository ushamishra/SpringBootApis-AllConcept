package com.example.demo.filter;


import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("INIT FILTER.....");
    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException, ServletException {
        System.out.println("DO FILTER.....");

        System.out.println("INFO");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("DESTORY FILTER.....");
    }
}
