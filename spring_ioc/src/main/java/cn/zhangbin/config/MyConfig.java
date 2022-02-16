package cn.zhangbin.config;

import cn.zhangbin.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 代表这是一个配置类
@Import(MyConfig2.class) // 导入其他配置,类似于配置文件中的include标签
public class MyConfig {

    @Bean // 通过方法注册一个bean,这里的返回值就是Bean的类型,方法名就是bean的id!
    public Dog dog(){
        return new Dog();
    }
}
