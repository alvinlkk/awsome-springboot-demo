package com.alvinlkk.cfg;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * ApplicationListener接口： 监听器，
 * ContextRefreshedEvent： 容器初始化或刷新时触发该事件
 *
 * @author alvinkk
 * @create 2018-05-08 11:34
 **/
public class ApplictaionStartListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 在传统的spring系统中，可能发生二次调用的问题，主要是原因是初始化root容器之后，会初始化project-servlet.xml对应的子容器。
        //springboot的方式不会出现这种情况
        if(event.getApplicationContext().getParent() != null) {
            return ;
        }
        System.out.println("我的父容器：" + event.getApplicationContext().getParent());
        System.out.println("我被调用了");
    }
}
