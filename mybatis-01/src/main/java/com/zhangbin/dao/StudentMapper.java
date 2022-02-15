package com.zhangbin.dao;

import com.zhangbin.pojo.Student;

import java.util.List;

public interface StudentMapper {
    // 获取所有学生及对应老师的信息
    List<Student> getStudents();

    List<Student> getStudents2();

    //根据id获取对应学生的信息
    Student getStudentById(int id);
}
