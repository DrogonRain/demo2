package cn.zhangbin.dao;

import cn.zhangbin.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser();

    int addUser(User user);

    int deleteUser(int id);
}
