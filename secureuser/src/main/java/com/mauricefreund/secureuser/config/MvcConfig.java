package com.mauricefreund.secureuser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry viewRegistry) {
        viewRegistry.addViewController("/home").setViewName("home");
        viewRegistry.addViewController("/").setViewName("home");
        viewRegistry.addViewController("/hello").setViewName("hello");
        viewRegistry.addViewController("/login").setViewName("login");
    }
}
