package com.etoak.springboot.springbootmapperpagehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.etoak.springboot.springbootmapperpagehelper.dao")
public class SpringbootMapperPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMapperPagehelperApplication.class, args);
    }
}
