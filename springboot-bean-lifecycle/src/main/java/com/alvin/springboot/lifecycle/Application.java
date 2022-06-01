package com.alvin.springboot.lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alvin.springboot.lifecycle.initializer.TestApplicationContextInitializer;
import com.alvin.springboot.lifecycle.model.User;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addInitializers(new TestApplicationContextInitializer());
        ConfigurableApplicationContext context = springApplication.run(args);

        User user = context.getBean(User.class);
        log.info("************************username: [{}]", user.getUsername());
    }
}
