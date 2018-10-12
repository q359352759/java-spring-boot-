package com.hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.hello.*")      //


public class HelloApplication extends SpringBootServletInitializer {
//    @Override
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(HelloApplication.class);
    };
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
