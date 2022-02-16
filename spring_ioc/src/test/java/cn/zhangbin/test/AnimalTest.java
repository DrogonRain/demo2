package cn.zhangbin.test;

import cn.zhangbin.pojo.Animal;
import cn.zhangbin.pojo.Cat;
import cn.zhangbin.pojo.Dog;
import cn.zhangbin.service.UserService;
import cn.zhangbin.service.impl.ProxyInvocationHandler;
import cn.zhangbin.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.name);
    }

//    @Test
//    public void test2(){
//        // 真是对象
//        UserServiceImpl userService = new UserServiceImpl();
//        // 代理对象的调用处理程序
//        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
//        proxy.setRent(userService); // 设置要代理的对象
//        UserService proxy1 = (UserService) proxy.getProxy(); // 动态生成代理类
//        proxy1.add();
//    }

    @Test
    public void test3(){
        /**
         * Spring的Aop就是将公共的业务 (日志 , 安全等) 和领域业务结合起来 , 当执行领域业务时 ,
         * 将会把公共业务加进来 . 实现公共业务的重复利用 . 领域业务更纯粹 , 程序猿专注领域业务 ,
         * 其本质还是动态代理 .
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser("张三",1);
    }

}
