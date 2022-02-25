package com.example.demoweb02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demoweb02.mapper")
public class DemoWeb02Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoWeb02Application.class, args);
    }

}
