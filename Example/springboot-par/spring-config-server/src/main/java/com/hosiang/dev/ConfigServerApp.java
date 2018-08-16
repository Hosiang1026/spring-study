package com.hosiang.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * 配置中心
 *
 * @author Howe Hsiang
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApp.class);
    }
}
