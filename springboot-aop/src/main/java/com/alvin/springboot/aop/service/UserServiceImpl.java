/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.aop.service;

import java.util.Collections;
import java.util.List;

import com.alvin.springboot.aop.model.User;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/13
 * @since 1.0
 **/
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUserList() {
        return Collections.singletonList(new User("alvin", 18));
    }

    @Override
    public void addUser() {

    }
}
