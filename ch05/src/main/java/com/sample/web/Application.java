package com.sample.web;

import com.sample.ComponentScanBasePackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanBasePackage.class})
@RestController
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
