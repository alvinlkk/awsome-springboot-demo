/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.scope;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/6
 * @since 1.0
 **/
public class SingletonBean {

    @Autowired
    private PrototypeBean prototypeBean;

    SingletonBean() {
        System.out.println("实例化 SingletonBean");
    }

    public void init() {
        System.out.println("初始化 SingletonBean");
    }

    public void destroy() {
        System.out.println("销毁 SingletonBean");
    }
}
