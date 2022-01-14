package com.example.demo.cases;

import com.example.demo.controller.UserController;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
@SpringBootTest
public class LoginTest  extends AbstractTestNGSpringContextTests {
    @Autowired
    UserController userController;

    @Test
    public void test1(){
        logger.info("-----开始执行-----");
        User user =new User();
        user.setUsername("1");
        user.setPassword("123456");
        String logininfo = userController.login(user);
        Assert.assertEquals(logininfo,"用户名或密码错误！");
        logger.info(logininfo+"test1执行成功");
    }
}
