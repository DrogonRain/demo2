package com.zhangbin.pojo;

public class User {
    private int id;
    private String name;
    private String password;

    public User(){}

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.password = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: "+this.id+" - 用户名: "+this.name+" - 密码: "+this.password;
    }
}
