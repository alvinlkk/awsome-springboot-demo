/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.tx.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.UserService;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/4/21
 **/
@Service
public class TxManager implements TxService {

    @Autowired
    private UserService userService;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.NEVER)
    public void testTx() {
        try {
            User user = new User("cc", "222", 20);
            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
