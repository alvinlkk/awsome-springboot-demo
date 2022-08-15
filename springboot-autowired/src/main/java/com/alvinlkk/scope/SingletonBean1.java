/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/6
 * @since 1.0
 **/
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean1 {

    @Autowired
    private PrototypeBean1 prototypeBean;

    public void callProtypeBeanPrint() {
        prototypeBean.printCurrentObj();
    }
}
