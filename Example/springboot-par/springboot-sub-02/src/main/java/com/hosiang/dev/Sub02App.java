package com.hosiang.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class Sub02App
{
    public static void main( String[] args )
    {
        SpringApplication.run(Sub02App.class);
    }
}
