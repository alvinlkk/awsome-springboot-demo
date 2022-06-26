/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import com.alvin.springboot.lifecycle.bean.BeanLifeCycle;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/6/16
 * @since 1.0
 **/
@Slf4j
@Component
public class TestDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object obj, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################DestructionAwareBeanPostProcessor before destroy: bean:[{}], beanName: [{}]", obj, beanName);
        }
    }

    @Override
    public boolean requiresDestruction(Object bean) {
        if(bean instanceof BeanLifeCycle) {
            log.info("################DestructionAwareBeanPostProcessor requiresDestruction: bean:[{}]", bean);
        }
        // true表示销毁， false表示不销毁，也不会执行postProcessBeforeDestruction方法了
        return true;
    }
}
