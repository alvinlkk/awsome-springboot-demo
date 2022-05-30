package com.alvin.springboot.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alvin.springboot.initializer.TestApplicationContextInitializer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addInitializers(new TestApplicationContextInitializer());
        springApplication.run(args);
    }
}
