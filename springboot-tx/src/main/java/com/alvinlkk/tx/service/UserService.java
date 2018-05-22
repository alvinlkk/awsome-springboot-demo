package com.alvinlkk.tx.service;

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

    void insertUser(User user);

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
