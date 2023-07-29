/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.async.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvin.async.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/3/17
 **/
@EnableAsync
@RestController
@Slf4j
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @GetMapping("/async")
    public String asyncCallerMethod() throws InterruptedException {
        long start = System.currentTimeMillis();
        log.info("call async method, thread name: [{}]", Thread.currentThread().getName());
        asyncService.asyncMethod();
        String response = "task completes in :" +
                (System.currentTimeMillis() - start) + "milliseconds";
        return response;
    }

    @GetMapping("/asyncFuture")
    public String asyncFuture() throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();
        log.info("call async method, thread name: [{}]", Thread.currentThread().getName());
        Future<String> future = asyncService.futureMethod();
        // 阻塞获取结果
        String taskResult = future.get();
        String response = taskResult + "task completes in :" +
                (System.currentTimeMillis() - start) + "milliseconds";
        return response;
    }
}
