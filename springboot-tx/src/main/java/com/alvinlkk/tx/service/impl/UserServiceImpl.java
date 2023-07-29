package com.alvinlkk.tx.service.impl;

import com.alvinlkk.tx.mapper.UserMapper;
import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author alvinkk
 * @create 2018-05-21 15:05
 **/
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.getAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertUser(User user) {
        userMapper.insert(user);
        throw new RuntimeException("ss");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertUser2(User user) {
        userMapper.insert(user);
    }

    @Override
    @Transactional(isolation=Isolation.READ_UNCOMMITTED)
    public void updateUser(User user) throws InterruptedException {
        System.out.println("update before: " + userMapper.getByUserName("ccj"));
        userMapper.updateUser(user);
        System.out.println("update after: " + userMapper.getByUserName("ccj"));
        Thread.sleep(5000);
        System.out.println("update end ");
    }

    @Override
    @Transactional(isolation=Isolation.READ_UNCOMMITTED)
    public User selectUser(String userName) {
        User user = userMapper.getByUserName(userName);
        System.out.println(user);
        return user;
    }

    @Transactional(isolation=Isolation.REPEATABLE_READ)
    @Override
    public void repeateRead(String userName) {
        User user1 = userMapper.getByUserName(userName);
        System.out.println("repeateRead before" + user1);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user2 = userMapper.getByUserName(userName);
        System.out.println("repeateRead after" + user2);

    }

    //@Transactional(isolation=Isolation.REPEATABLE_READ)
    @Override
    public void repeateUpdate(User user) {
        userMapper.updateUser(user);
    }

    @Transactional(isolation=Isolation.SERIALIZABLE)
    @Override
    public void missRead(String userName) {
        System.out.println("missRead start");
        List<User> userList1 = userMapper.listByUserName(userName);
        System.out.println("missRead before" + userList1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<User> userList2 = userMapper.listByUserName(userName);
        System.out.println("missRead after" + userList2);
        System.out.println("missRead end");
    }

    @Override
    public void missReadInsert(User user) {
        System.out.println("missReadInsert before");
        userMapper.insert(user);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("missReadInsert after");
    }
}
