package com.hosiang.dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value(value = "${book.author}")
    private String author;

    @Value(value = "${book.name}")
    private String name;

    @Value(value = "${book.pinyin}")
    private String pinyin;

    @RequestMapping("/")
    public String Hello() {
        String result = "This is My Frist Spring Boot App 8021   "
                +"author："+author+"name："+name+"pinyin："+pinyin;
        System.out.println(result);
        return result;
    }
}
