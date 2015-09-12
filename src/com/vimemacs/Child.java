package com.vimemacs;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by hwd on 2015/9/12.
 */
public class Child extends Parent{
    @Test
    public void testExtends() {
        // 无法访问父类的所有私有成员方法
        // System.out.println(name);
        // 在同个包中，是可以访问的，不在同一个包不能访问
        // System.out.println(age);
        // 因为protected专门让子类继承用的
        System.out.println(addr);
        // 对于public 都可以访问
        System.out.println(country);

        // 可以调用父类的所有public的方法
        tel();
        // 可以访问父类的protected方法
        run();
    }

    public void tel() {
        System.out.println("Child teling...");
    }

    public void run() {
        System.out.println("Child running...");
    }
}
