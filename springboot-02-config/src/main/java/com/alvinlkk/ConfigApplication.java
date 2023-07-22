package com.alvinlkk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.alvinlkk.bean.User;
import com.alvinlkk.bean.ValueTestBean;
import com.alvinlkk.config.Cat;
import com.alvinlkk.config.Person;
import com.alvinlkk.config.TestConfig;

/**
 * Hello world!
 * idea properties 乱码问题
 */
@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class ConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigApplication.class, args);

//        User userBean = context.getBean(User.class);
//        System.out.println(userBean);

//        ValueTestBean valueTestBean = context.getBean(ValueTestBean.class);
//        System.out.println(valueTestBean);
//
//        Cat cat = context.getBean("cat", Cat.class);
//        Person dadPerson = context.getBean("dad", Person.class);
//        Person momPerson = context.getBean("mom", Person.class);
//        System.out.println(cat);
//        System.out.println(dadPerson.getCat());
//        System.out.println(momPerson.getCat());

//        TestConfig testConfig = context.getBean(TestConfig.class);
//
//        Cat newCat = testConfig.cat();
//        System.out.println(newCat);
//        System.out.println(testConfig);
    }
}
