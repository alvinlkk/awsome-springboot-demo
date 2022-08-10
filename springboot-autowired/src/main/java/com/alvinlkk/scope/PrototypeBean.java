/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.scope;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/6
 * @since 1.0
 **/
public class PrototypeBean {

    PrototypeBean() {
        System.out.println("实例化 PrototypeBean");
    }

    public void init() {
        System.out.println("初始化 PrototypeBean");
    }

    public void destroy() {
        System.out.println("销毁 PrototypeBean");
    }
}
