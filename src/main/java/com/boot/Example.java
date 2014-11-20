package com.boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


/*
 * http://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html
 */

@Configuration
@RestController
@EnableAutoConfiguration
@ComponentScan
public class Example {
    
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}