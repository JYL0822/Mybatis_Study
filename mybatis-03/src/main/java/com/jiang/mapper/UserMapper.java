package com.jiang.mapper;

import com.jiang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询指定用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

}
