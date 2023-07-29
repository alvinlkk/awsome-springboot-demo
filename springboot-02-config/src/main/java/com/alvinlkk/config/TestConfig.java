package com.alvinlkk.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用户配置bean
 *
 * @author: cxw (cxw@my.com.cn)
 * @date: 2022/8/18  13:20
 * @version: 1.0.0
 */
@Configuration
public class TestConfig {

    /**
     * 定义猫
     * @return
     */
    @Bean(name = "cat")
    public Cat cat() {
        return new Cat("小猫" + new Random().nextInt(100));
    }

    /**
     * 爸爸
     * @return
     */
    @Bean(name = "dad")
    public Person dadPerson() {
        return new Person("dad", cat());
    }

    /**
     * 爸爸
     * @return
     */
    @Bean(name = "mom")
    public Person momPerson() {
        return new Person("mom", cat());
    }
}
