package com.jiang.mapper;

import com.jiang.pojo.Teacher;
import com.jiang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher2(1);
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }

        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher2 = mapper.getTeacher(1);
        for (Teacher teacher3 : teacher2) {
            System.out.println(teacher3);
        }

        sqlSession.close();
    }
}
