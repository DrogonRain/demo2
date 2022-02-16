package cn.zhangbin.service.impl;

import cn.zhangbin.service.Rent;

//真实角色: 房东, 房东要出租房子
public class Host implements Rent {
    public void rent(){
        System.out.println("房屋出租:");
    }

    public void Rent2() {
        System.out.println("房屋出租!");
    }
}
