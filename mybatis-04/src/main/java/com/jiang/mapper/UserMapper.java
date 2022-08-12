package com.jiang.mapper;

import com.jiang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
* 注解开发
* */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    //根据id,name查询信息
    @Select("select * from user where id=#{id} and name=#{name}")
    User getUserById(@Param("id") int id, @Param("name") String name);
}
