package com.alvinlkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "hello security";
    }

    @GetMapping("/test")
    public String test() {
        return "hello test";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/roleAuth")
    public String roleAuth() {
        return "hello roleAuth";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/testAuth")
    public String testAuth() {
        return "hello testAuth";
    }
}