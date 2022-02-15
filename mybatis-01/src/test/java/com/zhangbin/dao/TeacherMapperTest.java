package com.zhangbin.dao;

import com.zhangbin.pojo.Teacher;
import com.zhangbin.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {
    @Test
    public void testGetTeacher(){
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        int size = teacher.getStudents().size();
        System.out.print(teacher.getName()+"的学生有: (");
        for (int i = 0; i < size-1; i++) {
            System.out.print(teacher.getStudents().get(i).getName()+",");
        }
        System.out.print(teacher.getStudents().get(size-1).getName()+")");
        session.close();
    }
}
