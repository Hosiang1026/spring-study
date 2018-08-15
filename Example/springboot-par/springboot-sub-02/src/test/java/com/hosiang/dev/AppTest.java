package com.hosiang.dev;

import static org.junit.Assert.assertTrue;

import com.hosiang.dev.controller.TestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Sub02App.class)
public class AppTest 
{
    @Autowired
    TestController testController;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test()
    {
        String result = testController.Hello();
        System.out.println(result);
        Assert.assertEquals("This is My Frist Spring Boot App 8022",result);
    }
}
