package com.jiang.pojo;


import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    //多个学生需要关联一个老师
    private Teacher teacher;
}
