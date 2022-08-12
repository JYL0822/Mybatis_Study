package com.jiang.mapper;

import com.jiang.pojo.User;
import com.jiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.testng.annotations.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭SqlSeesion
        sqlSession.close();
    }

}
