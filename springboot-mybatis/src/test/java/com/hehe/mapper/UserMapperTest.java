package com.hehe.mapper;

import com.alibaba.fastjson.JSONObject;
import com.hehe.MybatisApplicationTest;
import com.hehe.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest extends MybatisApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void select(){
        User user = userMapper.selectById(2);
        System.out.println(JSONObject.toJSONString(user));

        userMapper.deleteById(2);

        List<User> users = userMapper.selectAll();
        System.out.println(JSONObject.toJSONString(users));
    }
}