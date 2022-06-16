package com.alvin.springboot.lifecycle.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component("student")
@ToString
@Data
public class Student {

    @Value("${user.username:alvin}")
    private String username;

    @Value("${user.age:12}")
    private int age;


}
