package com.vimemacs;

import java.lang.reflect.Constructor;

/**
 * Created by hwd on 2015/9/21.
 */
public class NewClassDemo {
    public static void main(String[] args) throws Exception {
        // 1:证明这个类的名称
        String name = "com.vimemacs.Two";
        // 2:加载这个类的字节码
        Class<?> cls = Class.forName(name);

        // 3:实例化这个类
        // Object obj = cls.newInstance();

        // 3:获取这个类的构造方法的反射对象，设置接收一个String类型的参数
        Constructor<?> cons = cls.getConstructor(String.class);
        // 4:通过构造实例化这个类
        Object obj = cons.newInstance("Jack");

        System.out.println("obj" + obj);
    }
}

class Two {
    public Two() {
        System.out.println("我被实例化了:" + this);
    }

    public Two(String name) {
        System.out.println("我被实例化了:" + this + ", name is:" + name);
    }

    static {
        System.out.println("加载类");
    }
}
