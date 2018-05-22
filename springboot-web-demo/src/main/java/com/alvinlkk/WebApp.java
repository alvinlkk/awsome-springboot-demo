package com.alvinlkk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = "com.alvinlkk.web.mapper")
public class WebApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApp.class, args);
    }
}
