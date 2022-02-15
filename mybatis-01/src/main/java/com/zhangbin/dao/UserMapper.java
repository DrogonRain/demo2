package com.zhangbin.dao;

import com.zhangbin.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUser(Map<String,Object> map);

    //根据id查询用户信息
    User getUserById(int id);

    //插入用户信息
    int addUser(User user);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser2(User user);

    //根据id和用户名查询用户
    User getUserByIdAndName(Map<String,Object> map);

    //模糊查询
    List<User> getUserByLike(String str);

    @Select("select id,name,pwd password from user where id = #{id}")
    User getAllUser(@Param("id") int id);

    User queryUserById(@Param("id") int id);
}
