package com.example.demo.service.impl;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper usermapper;

    @Override
    public User loginByUserInfo(User user) {
        User countByInfo = usermapper.getCountByInfo(user);
        return countByInfo;
    }
}
