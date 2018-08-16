package com.hosiang.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 *  该注解指定项目为springboot，由此类当作程序入口
 *  自动装配 web 依赖的环境
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp
{
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class);
	}
}
