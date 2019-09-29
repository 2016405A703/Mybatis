package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.demo.controller","com.demo.dao","com.demo.entity","com.demo.service"})
//@MapperScan(basePackages = "com.demo.dao.ZzAtDao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
