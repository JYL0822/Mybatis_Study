package com.jiang.mapper;

import com.jiang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生学习包括对应老师的信息 --按照（子）查询嵌套处理
    public List<Student> getStudent();
    //查询所有学生学习包括对应老师的信息 --按照内容嵌套处理
    public List<Student> getStudent2();
}
