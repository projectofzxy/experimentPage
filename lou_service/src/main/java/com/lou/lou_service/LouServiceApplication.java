package com.lou.lou_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lou.lou_service.mapper")
public class LouServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LouServiceApplication.class, args);
    }

}
