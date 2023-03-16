/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.inject;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/2/19
 **/
@Service
public class AutowiredTestService {

    @Autowired
    private UserService userService1;


    @Resource
    private UserService userService2;

//    @Autowired
//    public AutowiredTestService(UserService userService) {
//        this.userService = userService;
//    }

}
