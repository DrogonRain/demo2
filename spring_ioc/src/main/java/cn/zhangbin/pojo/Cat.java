package cn.zhangbin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("cat") // 相当于配置文件中<bean id="cat" class="当前注解的类"/>
@Controller("cat")
@Scope("prototype") // 默认为singleton单例模式 / 可修改为prototype多例模式 单例关闭工厂即销毁,多例等回收站
public class Cat {

    /**
     * 相当于配置文件中<property name = "name" value = "喵~"/>
     * PS: 可以不提供set方法,如果有set方法则在set方法上添加@value("值")
     */
    @Value("喵~")
    public String name;

//    @Value("喵~")
//    public void setName(String name) {
//        this.name = name;
//    }
}
