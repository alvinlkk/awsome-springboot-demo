package com.alvinlkk.tx.service;

import java.util.List;

import com.alvinlkk.tx.mapper.UserMapper;
import com.alvinlkk.tx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author alvinkk
 * @create 2018-05-21 15:03
 **/
public interface UserService {

    List<User> listAll();

    void insertUser(User user);

    void insertUser2(User user);

    void updateUser(User user) throws InterruptedException;

    User selectUser(String userName);

    /**
     * 重复读测试
     */
    void repeateRead(String userName);

    void repeateUpdate(User user);

    void missRead(String userName);

    void missReadInsert(User user);

}
