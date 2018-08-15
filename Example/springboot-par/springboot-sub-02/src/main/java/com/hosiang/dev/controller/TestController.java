package com.hosiang.dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String Hello() {
        return "This is My Frist Spring Boot App 8022";
    }
}
