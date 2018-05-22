package com.alvinlkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan
public class TemplateApp {
    public static void main( String[] args )
    {
        SpringApplication.run(TemplateApp.class, args);
    }
}
