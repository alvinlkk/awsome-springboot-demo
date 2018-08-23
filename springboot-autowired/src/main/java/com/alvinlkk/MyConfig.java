package com.alvinlkk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author alvinkk
 * @create 2018-08-08 17:10
 **/
@Configuration
public class MyConfig {

    @Bean
    public User user1() {
        return new User("alvin", 1);
    }

    @Bean
    public User user2() {
        return new User("likai", 2);
    }
}
