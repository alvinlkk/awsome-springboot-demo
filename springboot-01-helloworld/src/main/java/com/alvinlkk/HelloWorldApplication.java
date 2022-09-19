package com.alvinlkk;


import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvinlkk.task.SumRunnable;

@SpringBootApplication
@RequestMapping("/show")
@RestController
public class HelloWorldApplication {

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @PostConstruct
    public void init() throws InterruptedException {
        // 提交1000个线程任务
        for (int i = 0; i < 1000; i++) {
            // 定义求和任务
            SumRunnable sumRunnable = new SumRunnable();
            // 包装求和任务
            RunnableWrapper runnableWrapper = new RunnableWrapper(sumRunnable, "求和线程任务" + i);
            // 提交任务
            threadPoolExecutor.submit(runnableWrapper);

            Thread.sleep(100);
        }
    }

    @GetMapping("/unicode")
    public String showUnicode() {
        return "'\\u4f60\\u597d'";
    }

    public static void main( String[] args ) throws InterruptedException {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
