package com.jiang.mapper;


import com.jiang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    //获取指定老师下的所有学生和老师的信息--结果查询
    List<Teacher> getTeacher2(@Param("tid") int id);

    //获取指定老师下的所有学生和老师的信息--子查询
    List<Teacher> getTeacher(@Param("tid") int id);
}
