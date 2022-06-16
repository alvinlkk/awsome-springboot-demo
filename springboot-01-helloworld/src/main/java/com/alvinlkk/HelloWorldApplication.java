package com.alvinlkk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/show")
@RestController
public class HelloWorldApplication {


    @GetMapping("/unicode")
    public String showUnicode() {
        return "'\\u4f60\\u597d'";
    }

    public static void main( String[] args ) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
