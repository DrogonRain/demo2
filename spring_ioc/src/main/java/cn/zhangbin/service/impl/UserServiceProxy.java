package cn.zhangbin.service.impl;

import cn.zhangbin.service.UserService;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }

    public void getUser() {
        log("getUser");
//        userService.getUser();
    }

    public String getUser(String name, int id) {
        return "t";
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void select() {
        log("select");
        userService.delete();
    }

    public void log(String str){
        System.out.println("执行了"+str+"方法");
    }
}
