package com.alvinlkk.web.pojo;

/**
 * @author alvinkk
 * @create 2018-05-10 15:33
 **/
public class User {

    private String userName;

    private String password;

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
