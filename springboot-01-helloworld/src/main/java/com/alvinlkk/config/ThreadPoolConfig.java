/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.config;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/17
 * @since 1.0
 **/
@Configuration
public class ThreadPoolConfig {

    @Bean(destroyMethod = "shutdown")
    public ThreadPoolExecutor sumTaskThreadPool() {
        return new ThreadPoolExecutor(50, 800, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(500));
    }
}
