package com.study.springboot;

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
public class EurekaServerApplication
{
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}
}
