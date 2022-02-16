package cn.zhangbin.dao.impl;

import cn.zhangbin.dao.TeacherMapper;
import cn.zhangbin.pojo.Teacher;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class teacherDaoImpl extends SqlSessionDaoSupport implements TeacherMapper {
    public Teacher queryTeacherById(int id) {
        TeacherMapper mapper = getSqlSession().getMapper(TeacherMapper.class);
        return mapper.queryTeacherById(id);
    }
}
