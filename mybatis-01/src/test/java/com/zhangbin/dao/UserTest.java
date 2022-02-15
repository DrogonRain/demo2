package com.zhangbin.dao;

import com.zhangbin.pojo.User;
import com.zhangbin.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {
    @Test
    public void testQueryUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);
        session.close();
    }

    @Test
    public void testQueryUser2(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        session.clearCache(); // 手动清除一级缓存
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);
        session.close();
    }
}
