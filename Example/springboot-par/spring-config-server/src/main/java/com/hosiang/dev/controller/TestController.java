package com.hosiang.dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

/*    @Value(value = "${book.author}")
    private String author;*/

    @RequestMapping("/test")
    public String Hello() {
        String result = "9001  ";
        System.out.println(result);
        return result;
    }
}
