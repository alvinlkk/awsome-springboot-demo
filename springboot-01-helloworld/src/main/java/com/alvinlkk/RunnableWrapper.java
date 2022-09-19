/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;

/**
 * Runnable的包装器
 *
 * @author alvin
 * @date 2022/8/17
 * @since 1.0
 **/
// 线程任务包装类，用了装饰设计模式
@Slf4j
public class RunnableWrapper implements Runnable {
    // 实际要执行的线程任务
    private Runnable task;
    // 线程任务被创建出来的时间
    private long createTime;
    // 线程任务被线程池运行的开始时间
    private long startTime;
    // 线程任务被线程池运行的结束时间
    private long endTime;
    // 线程信息
    private String taskInfo;

    // 当这个任务被创建出来的时候，就会设置他的创建时间
    // 但是接下来有可能这个任务提交到线程池后，会进入线程池的队列排队
    public RunnableWrapper(Runnable task, String taskInfo) {
        this.task = task;
        this.taskInfo = taskInfo;
        this.createTime = System.currentTimeMillis();
    }

    // 当任务在线程池排队的时候，这个run方法是不会被运行的
    // 但是当任务结束了排队，得到线程池运行机会的时候，这个方法会被调用
    // 此时就可以设置线程任务的开始运行时间
    @Override
    public void run() {
        this.startTime = System.currentTimeMillis();

        // 此处可以通过调用监控系统的API，实现监控指标上报
        // 用线程任务的startTime-createTime，其实就是任务排队时间
        // 这边打印日志输出，也可以输出到监控系统中
        log.info("任务信息: [{}], 任务排队时间: [{}]ms", taskInfo, startTime - createTime);

        // 接着可以调用包装的实际任务的run方法
        task.run();

        // 任务运行完毕以后，会设置任务运行结束的时间
        this.endTime = System.currentTimeMillis();

        // 此处可以通过调用监控系统的API，实现监控指标上报
        // 用线程任务的endTime - startTime，其实就是任务运行时间
        // 这边打印任务执行时间，也可以输出到监控系统中
        log.info("任务信息: [{}], 任务执行时间: [{}]ms", taskInfo, endTime - startTime);
    }
}
