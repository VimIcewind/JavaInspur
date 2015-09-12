package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class OverLoad {
    public void print() {
        System.out.println("没有参数。。。");
    }

    public void print(int age) {
        System.out.println("年龄为：" + age);
    }

    public void print(String age) {
        System.out.println("你的年龄为：" + age);
    }

    public int print(String name, int age) {
        System.out.println("你的姓名为：" + name + "你的年龄为：" + age);
        return 0;
    }

    public  int print(int age, String name) {
        System.out.println("你的姓名为：" + name + "你的年龄为：" + age);
        return 0;
    }
}
