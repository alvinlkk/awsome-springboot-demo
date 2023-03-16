/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.aop.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alvin.springboot.aop.model.User;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/13
 * @since 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> dealUsers() {

        this.addUser();

        return Collections.singletonList(new User("alvin", 18));
    }

    @Override
    public void addUser() {
        System.out.println("add user ing ....");
    }
}
