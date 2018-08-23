package com.alvinlkk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    private Map<String, User> userMap;

    @Autowired
    private List<User> users;

    @Test
    public void testAutowiredMap() {
        System.out.println(userMap.size());
        System.out.println(users);
    }
}
