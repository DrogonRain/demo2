package cn.zhangbin.test;

import cn.zhangbin.dao.TeacherMapper;
import cn.zhangbin.dao.UserMapper;
import cn.zhangbin.dao.impl.UserDaoImpl;
import cn.zhangbin.pojo.Student;
import cn.zhangbin.pojo.Teacher;
import cn.zhangbin.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class UserMapperTest {

//    @Test
//    public void selectUser() throws Exception{
//        String resource = "mybatis.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = factory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        List<User> users = mapper.selectUser();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        session.close();
//    }

    @Test
    public void queryTeacherByStudent() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TeacherMapper mapper = (TeacherMapper) context.getBean("teacherDao");
        Teacher teacher = mapper.queryTeacherById(1);
        if (teacher!=null){
            System.out.print(teacher.getId()+"号"+teacher.getName()+"的学生有: (");
            List<Student> students = teacher.getStudents();
            int len = students.size();
            for (int i = 0; i < len - 1; i++) {
                System.out.print(students.get(i).getName()+",");
            }
            System.out.println(students.get(len-1).getName()+")");
        }else{
            System.out.println("暂无数据!");
        }
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper mapper = (UserMapper) context.getBean("userDao");
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
