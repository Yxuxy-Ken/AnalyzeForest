package com.ken.forest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ken.forest.mapper")
@SpringBootApplication
public class ForestBaseQueryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForestBaseQueryApplication.class);
    }
}
