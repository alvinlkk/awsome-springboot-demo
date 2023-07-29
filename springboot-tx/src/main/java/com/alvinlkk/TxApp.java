package com.alvinlkk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.alvinlkk.tx.mapper")
public class TxApp {
    public static void main( String[] args ) {
        SpringApplication.run(TxApp.class, args);
    }
}
