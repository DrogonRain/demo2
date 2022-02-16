package cn.zhangbin.dao;

import cn.zhangbin.pojo.Student;
import cn.zhangbin.pojo.Teacher;

public interface TeacherMapper {

    // 根据id获取学生全部信息
    Teacher queryTeacherById(int id);
}
