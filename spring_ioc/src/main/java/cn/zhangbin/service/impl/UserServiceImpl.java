package cn.zhangbin.service.impl;

import cn.zhangbin.dao.UserDao;
import cn.zhangbin.dao.impl.UserDaoImpl;
import cn.zhangbin.dao.impl.UserDaoMySqlmpl;
import cn.zhangbin.service.UserService;

public class UserServiceImpl implements UserService {

    public String getUser(String name,int id) {
        return id+"号角色为"+name;
    }

    public void add() {
        System.out.println("新增一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("修改一个用户");
    }

    public void select() {
        System.out.println("查询一个用户");
    }
}
