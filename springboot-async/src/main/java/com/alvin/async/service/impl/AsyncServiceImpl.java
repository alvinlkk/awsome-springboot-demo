/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.async.service.impl;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.alvin.async.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/3/17
 **/
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService  {

    @Async
    @Override
    public void asyncMethod() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Thread: [{}], Calling other service..", Thread.currentThread().getName());
        int a = 1/0;
    }

    @Async
    @Override
    public Future<String> futureMethod() throws InterruptedException {
        Thread.sleep(5000);
        log.info("Thread: [{}], Calling other service..", Thread.currentThread().getName());
        return new AsyncResult<>("task Done");
    }
}
