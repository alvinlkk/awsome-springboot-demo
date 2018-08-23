package com.alvinlkk.task;

import com.alvinlkk.ScheduleApplication;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * Created by Think on 2018/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ScheduleApplication.class)
public class AsyncTaskTest {

    @Autowired
    AsyncTask task;

    @Test
    public void test() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }

    @Test
    public void testCallback() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskFour();
        Future<String> task2 = task.doTaskFive();

        while (true) {
            if(task1.isDone() && task2.isDone()) {
                break;
            }

            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}