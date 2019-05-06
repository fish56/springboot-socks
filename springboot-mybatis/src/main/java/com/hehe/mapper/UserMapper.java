package com.hehe.mapper;

import com.hehe.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user where 1=1")
    List<User> selectAll();

    @Select("select * from t_user where username like #{username}")
    List<User> selectByUsername(String username);

    @Select("select * from t_user where user_id like #{userId}")
    User selectById(Integer userId);

    @Delete("delete from t_user where user_id like #{userId}")
    int deleteById(Integer userId);

}
