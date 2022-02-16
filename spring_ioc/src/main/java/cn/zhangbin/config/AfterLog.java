package cn.zhangbin.config;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * @param o 返回值
     * @param method 被调用的方法
     * @param objects 被调用的方法的对象的参数
     * @param o1 被调用的目标对象
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+o1.getClass().getName()
        +"的"+method.getName()+"方法,"
        +"返回值: "+o);
    }
}
