package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/12.
 */
public class ThisDemo {
    // 因为局部变量与成员变量同名，于是成员变量不可见
    private String name = "Jack";
    private static int age = 100;

    @Test
    public void abc() {
        String name = "Rose";
        System.out.println("name is: " + name);
        // 可以使用this关键字来访问这个类的成员
        System.out.println("this.name is: " + this.name);

        int age = 90;
        System.out.println("age is: " + age);
        // 可以用this来访问一个静态的成员
        System.out.println("age is: " + this.age);
        // 更建议用类名点的形式访问这个静态的成员
        System.out.println("age is: " + ThisDemo.age);
    }

    // 静态的方法中，没有this引用
    public static void main(String[] args) {
        int age = 80;
        System.out.println("main age is: " + age);
        System.out.println("age is: " + ThisDemo.age);
    }
}
