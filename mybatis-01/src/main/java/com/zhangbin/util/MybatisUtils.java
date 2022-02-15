package com.zhangbin.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

//sqlSessionFactory --> sqlSession
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static{
        try{
            // 使用Mybatis获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 有了SqlSessionFactory,我们可以从中获取实例
    // SqlSession 完全包含了面向数据库执行SQL命令所需要的所有方法
    public static SqlSession getSession(){
        return getSession(true); // 事务自动提交
    }
    public static SqlSession getSession(boolean flag){
        return sqlSessionFactory.openSession(flag);
    }
}
