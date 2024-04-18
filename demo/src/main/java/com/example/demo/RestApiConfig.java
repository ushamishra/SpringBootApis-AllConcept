package com.example.demo;

import com.example.demo.filter.SimpleFilter;
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class RestApiConfig {

    @Autowired
    SimpleFilter deviceFilter;
    @Bean
    public FilterRegistrationBean<SimpleFilter> filterRegistrationBean(){
        FilterRegistrationBean<SimpleFilter> registrationBean = new
                FilterRegistrationBean<>();
        registrationBean.setFilter(deviceFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
