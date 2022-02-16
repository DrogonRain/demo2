package cn.zhangbin.service.impl;

import cn.zhangbin.service.Rent;

// 客户类, 一般客户都会去找代理!
public class Client {

    /**
     * 静态代理的好处:
     *  可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情
     *  公共的业务由代理来完成 . 实现了业务的分工
     *  公共业务发生扩展时变得更加集中和方便
     * 缺点:
     *  类多了 , 多了代理类 , 工作量变大了 . 开发效率降低
     */

    public static void main(String[] args) {
//        // 房东要租房
//        Host host = new Host();
//        //中介帮助房东
//        Proxy proxy = new Proxy(host);
//        // 你去找中介
//        proxy.rent();

//        // 真实业务
//        UserServiceImpl userService = new UserServiceImpl();
//        // 代理类
//        UserServiceProxy proxy = new UserServiceProxy();
//        // 使用代理类实现日志功能!
//        proxy.setUserService(userService);
//        // 调用方法
//        proxy.add();
//        proxy.select();

        // 一个动态代理,一般代理某一类业务,一个动态代理可以代理多个类,代理的是接口!
        // 真实角色
        Host host = new Host();
        // 代理实例的调用处理程序
        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
        proxy.setRent(host); // 将真实角色防止进去!
        Rent proxy1 = (Rent) proxy.getProxy(); // 动态生成对应的代理类
        proxy1.rent();
    }
}
