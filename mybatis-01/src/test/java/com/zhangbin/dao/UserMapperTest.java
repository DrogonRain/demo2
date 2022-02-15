package com.zhangbin.dao;

import com.zhangbin.pojo.User;
import com.zhangbin.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserMapperTest {
//    @Test
//    public void test(){
//        // 1. 获得SQLSession对象
//        SqlSession sqlSession = MybatisUtils.getSession();
//        //2.运行SQL
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int currentPage = 1; // 第几页
//        int pageSize = 3; // 每页显示几个
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("startIndex",(currentPage-1)*pageSize);
//        map.put("pageSize",pageSize);
//        //3,运行方法
//        List<User> user = mapper.getUser(map);
//        //4.遍历输出
//        for (User user1 : user) {
//            System.out.println(user1);
//        }
//        //5.关闭session
//        sqlSession.close();
//    }
//
//    @Test
//    public void testgetByUserId(){
//        SqlSession session = MybatisUtils.getSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        User user = mapper.getUserById(1);
//        System.out.println(user);
//        session.close();
//    }
//
////    @Test
////    public void testAddUser(){
////        //增删改需要提交事务
////        SqlSession session = MybatisUtils.getSession();
////        UserMapper mapper = session.getMapper(UserMapper.class);
////        int row = mapper.addUser(new User(4,"王五","123456"));
////        session.commit();
////        System.out.println(row);
////    }
//
//    @Test
//    public void testGetUserByIdAndName(){
//        SqlSession session = MybatisUtils.getSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("id",3);
//        map.put("name","李四");
//        User user = mapper.getUserByIdAndName(map);
//        System.out.println(user);
//        session.close();
//    }
//
//    static Logger logger = Logger.getLogger(UserMapperTest.class);
//
//    @Test
//    public void testGetUserByLike(){
//        logger.info("info: 进入getUserByLike方法");
//        logger.debug("debug: 进入getUserByLike方法");
//        logger.error("error: 进入getUserByLike方法");
//        SqlSession session = MybatisUtils.getSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        String name = "李";
//        List<User> userByLike = mapper.getUserByLike(name);
//        for (User user : userByLike) {
//            System.out.println(user);
//        }
//        session.close();
//    }

    @Test
    public void testGetAllUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getAllUser(3);
        System.out.println(user);
        session.close();
    }

//    @Test
//    public void testAddUser(){
//        SqlSession session = MybatisUtils.getSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        User user = new User(6,"秦疆","123456");
//        mapper.addUser2(user);
//        session.close();
//    }
}
