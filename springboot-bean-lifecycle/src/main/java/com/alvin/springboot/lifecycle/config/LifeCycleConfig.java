package com.alvin.springboot.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alvin.springboot.lifecycle.model.LifeCycleBean;

@Configuration
public class LifeCycleConfig {

    @Bean(name = "lifeCycleBean", initMethod = "init", destroyMethod = "destroy")
    public LifeCycleBean createLifeCycleBean() {
        return new LifeCycleBean();
    };
}
