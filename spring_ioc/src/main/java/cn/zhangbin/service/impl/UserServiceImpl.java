package cn.zhangbin.service.impl;

import cn.zhangbin.dao.UserDao;
import cn.zhangbin.dao.impl.UserDaoImpl;
import cn.zhangbin.dao.impl.UserDaoMySqlmpl;
import cn.zhangbin.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
