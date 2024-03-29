/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/6/16
 * @since 1.0
 **/
@Component
@Slf4j
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################InstantiationAwareBeanPostProcessor before instant: [{}]", beanName);
            // 如果返回一个bean,则后续只会调用BeanPostProcessor的 postProcessAfterInitialization方法
            //return new BeanLifeCycle().setProp("aaa");
        }
        // 如果返回null,正常实例化
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################InstantiationAwareBeanPostProcessor after instant: bean: [{}], beanName: [{}]", bean, beanName);
        }
        // 返回true,表示Bean属性需要被赋值，否则不会
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################InstantiationAwareBeanPostProcessor postProcessProperties: pvs: [{}], bean: [{}], beanName: [{}]", pvs, bean, beanName);
        }
        return pvs;
    }
}
