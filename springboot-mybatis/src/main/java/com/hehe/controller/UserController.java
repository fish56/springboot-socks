package com.hehe.controller;

import com.hehe.mapper.UserMapper;
import com.hehe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/*")
    public List<User> hello(){
        return userMapper.selectAll();
    }
}
