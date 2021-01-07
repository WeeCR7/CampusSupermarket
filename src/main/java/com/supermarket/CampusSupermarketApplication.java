package com.supermarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhanjiawei
 */
@SpringBootApplication
@MapperScan("com.supermarket.mapper")
public class CampusSupermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusSupermarketApplication.class, args);
    }

}
