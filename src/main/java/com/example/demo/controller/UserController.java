package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if (null == username) {
            return "用户名为空！";
        }
        if (null == password) {
            return "密码为空！";
        }
        try {
            User result = userService.loginByUserInfo(user);
            if (null == result) {
                return "用户名或密码错误！";
            }
        } catch (Exception e) {
            System.out.println("系统异常:"+ e.getMessage());
            return "系统异常:"+ e.getMessage();
        }
        return "登录成功！";
    }
}
