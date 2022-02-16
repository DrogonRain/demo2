package cn.zhangbin.service.impl;

import cn.zhangbin.service.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的好处:
 *      1.可以使得我们得真实角色更加纯粹,不再去关注一些公共的事情
 *      2.公共的业务有代理来完成,实现了业务的分工
 *      3.公共业务发生扩展时变得更加集中和方便
 *      4.一个动态代理,一般代理某一类业务
 *      5.一个动态代理可以代理多个类,代理的是接口!
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setRent(Object target) {
        this.target = target;
    }

    // 生成代理类,重点是第二个参数,获取要代理的抽象角色! 之前都是一个角色,现在可以代理一类角色
    public Object getProxy(){             // 类加载器
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     * 处理代理实例上的方法调用并返回结果
     * @param proxy 代理类
     * @param method 代理类的调用处理程序的方法对象
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String methodName){
        System.out.println("执行了"+methodName+"方法");
    }

//    // 看房
//    public void seeHouse(){
//        System.out.println("带房客看房");
//    }
//
//    // 收中介费
//    public void fare(){
//        System.out.println("收取中介费");
//    }
}

