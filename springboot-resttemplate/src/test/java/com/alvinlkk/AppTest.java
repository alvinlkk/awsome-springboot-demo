package com.alvinlkk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        String url = "http://localhost:8080/user?id={userId}&name={userName}";
        Map<String, String> map = new HashMap<>();
        map.put("userId", "123");
        map.put("userName", "alvin");
        ResponseEntity<Map> result = restTemplate.getForEntity(url, Map.class, map);
    }
}
