package cn.zhangbin.service;

public interface UserService {
    String getUser(String name,int id);
    void add();
    void delete();
    void update();
    void select();
}
