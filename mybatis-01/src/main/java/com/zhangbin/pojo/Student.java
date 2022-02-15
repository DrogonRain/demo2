package com.zhangbin.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int id;
    private String name;
    private int tid;
    private List<Teacher> teachers; // 多个学生可以对应一个老师
}
