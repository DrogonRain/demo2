package cn.zhangbin.config;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 前置增强
public class Log implements MethodBeforeAdvice {
    /**
     * @param method 要执行的目标对象的方法
     * @param objects 被调用的方法的参数
     * @param o 目标对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"方法被执行了");
    }
}
