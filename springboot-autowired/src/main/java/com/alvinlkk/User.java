package com.alvinlkk;

/**
 * 用户
 *
 * @author alvinkk
 * @create 2018-08-08 17:09
 **/
public class User {

    private String userName;

    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
