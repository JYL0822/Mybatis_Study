package com.jiang.mapper;

import com.jiang.mapper.UserMapper;
import com.jiang.pojo.User;
import com.jiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //本质上利用了jvm的动态代理机制
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //本质上利用了jvm的动态代理机制
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = mapper.getUserById(1, "张三");
        System.out.println(u);
        sqlSession.close();
    }
}
