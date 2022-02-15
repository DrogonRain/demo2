package cn.zhangbin.test;

import cn.zhangbin.dao.impl.UserDaoImpl;
import cn.zhangbin.dao.impl.UserDaoMySqlmpl;
import cn.zhangbin.pojo.Hello;
import cn.zhangbin.pojo.Student;
import cn.zhangbin.pojo.User;
import cn.zhangbin.pojo.UserT;
import cn.zhangbin.service.UserService;
import cn.zhangbin.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
        userService.setUserDao(new UserDaoMySqlmpl());
        userService.getUser();
    }

    @Test
    public void test2(){
        // 解析beans.xml文件,生成管理响应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean:参数即为Spring配置文件中bean的id
        Hello hello =(Hello) context.getBean("h2");
        System.out.println(hello);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("serviceImpl");
        userService.getUser();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //执行getBean时user已经创建好了,通过无参构造
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        //调用对象方法
        System.out.println(user==user2);
    }

    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //执行getBean已经调用有参构造
        UserT userT = (UserT) context.getBean("t");
        //调用方法
        userT.show();
    }

    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        student.show();
    }
}
