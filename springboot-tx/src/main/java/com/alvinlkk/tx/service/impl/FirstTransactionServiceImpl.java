/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.tx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alvinlkk.tx.manager.TxManager;
import com.alvinlkk.tx.manager.TxService;
import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.FirstTransactionService;
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
public class FirstTransactionServiceImpl implements FirstTransactionService {

    @Autowired
    private SecondTransactionService secondTransactionService;

    @Autowired
    private UserService userService;

    @Autowired
    private TxManager txManager;

    @Autowired
    private TxService txService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transaction1() {
        System.out.println("do transaction1 .......");
        try {
            secondTransactionService.transaction2();
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }

        User user = new User("tx1", "111", 18);
        userService.insertUser2(user);
    }
}
