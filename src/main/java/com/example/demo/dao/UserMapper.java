package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User getCountByInfo(User user);

}
