package com.alvinlkk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JtaApp {
    public static void main( String[] args ) {
        SpringApplication.run(JtaApp.class, args);
    }
}
