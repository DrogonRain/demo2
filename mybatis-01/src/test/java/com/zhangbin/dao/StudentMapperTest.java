package com.zhangbin.dao;

import com.zhangbin.pojo.Student;
import com.zhangbin.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
//    @Test
//    public void testGetStudents(){
//        SqlSession session = MybatisUtils.getSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        List<Student> students = mapper.getStudents();
//        for (Student student : students) {
//            System.out.println("学生姓名: "+student.getName()+" - 老师姓名: "+student.getTeacher().getName());
//        }
//        session.close();
//    }
//
//    @Test
//    public void testGetStudents2(){
//        SqlSession session = MybatisUtils.getSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        List<Student> students = mapper.getStudents2();
//        for (Student student : students) {
//            System.out.println("学生姓名: "+student.getName()+" - 老师姓名: "+student.getTeacher().getName());
//        }
//        session.close();
//    }

    @Test
    public void testGetStudentById(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.getStudentById(1);
        System.out.print("id为"+student.getId()+"的学生姓名为: "+student.getName()+" - 授课教师有: (");
        int size = student.getTeachers().size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(student.getTeachers().get(i).getName()+",");
        }
        System.out.println(student.getTeachers().get(size-1).getName()+")");
        session.close();
    }
}
