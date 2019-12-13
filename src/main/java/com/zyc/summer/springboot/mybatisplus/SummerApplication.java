package com.zyc.summer.springboot.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyc.summer.springboot.mybatisplus.mapper")
public class SummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerApplication.class, args);
    }

}
