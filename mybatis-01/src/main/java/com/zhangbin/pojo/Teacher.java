package com.zhangbin.pojo;

import lombok.Data;

import java.util.List;

@Data // GET,SET,TOSTRING, 有参/无参构造
public class Teacher {
    private int id;
    private String name;
    // 一个老师多个学生
    private List<Student> students;
}
