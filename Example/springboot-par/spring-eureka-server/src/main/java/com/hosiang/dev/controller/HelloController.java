
/** 
 *
 * @Company:: ZJS 
 * @ClassName: package-info 
 * @author Hosiang
 * @date 2018年3月28日 下午2:17:54  
 */
package com.hosiang.dev.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("hello")
    public String hello() {
        return "Hello, world." ;
    }
}
