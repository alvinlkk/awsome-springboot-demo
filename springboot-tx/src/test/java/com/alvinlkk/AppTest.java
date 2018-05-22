package com.alvinlkk;

import static org.junit.Assert.assertTrue;

import com.alvinlkk.tx.mapper.UserMapper;
import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Autowired
    private UserService userService;

    @Test
    public void testReadCommit() throws InterruptedException {
        Thread t1 = new Thread(()->{
            User user = new User("ccj", "bitch", 18);
            try {
                userService.updateUser(user);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

         Thread.sleep(2000);

        Thread t2 = new Thread(()->{
            userService.selectUser("ccj");
        });

        t2.start();

        t1.join();
        t2.join();
    }

    @Test
    public void testRepeatRead() throws InterruptedException {
        Thread t1 = new Thread(()->{
            userService.repeateRead("ccj");
        });
        t1.start();

        Thread.sleep(1000);

        Thread t2 = new Thread(()->{
            User user = new User("ccj", "ffcc", 18);
            userService.repeateUpdate(user);
        });

        t2.start();

        t1.join();
        t2.join();
    }

    @Test
    public void testMissRead() throws InterruptedException {
        Thread t1 = new Thread(()->{
            userService.missRead("ccj");
        });

        Thread t2 = new Thread(()->{
            User user = new User("ccj", "ccccafsd", 18);
            userService.missReadInsert(user);
        });

        t2.start();

        Thread.sleep(1000);
        t1.start();

        t1.join();
        t2.join();
    }
}
