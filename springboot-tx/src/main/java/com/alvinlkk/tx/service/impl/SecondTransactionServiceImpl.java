/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.tx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.SecondTransactionService;
import com.alvinlkk.tx.service.UserService;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/4/21
 **/
@Service
public class SecondTransactionServiceImpl implements SecondTransactionService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction2() {
        System.out.println("do transaction2.....");
        User user = new User("tx2", "111", 18);
        userService.insertUser2(user);
        throw new RuntimeException();
    }
}
