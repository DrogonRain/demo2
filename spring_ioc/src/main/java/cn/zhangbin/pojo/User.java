package cn.zhangbin.pojo;

public class User {
    private String name;
    private int age;

    public User(){
        System.out.println("user无参构造方法");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名: "+name+" - 年龄: "+age;
    }

    public void show(){
        System.out.println("name = "+name);
    }
}
