package com.vimemacs;

import java.lang.reflect.Method;

/**
 * Created by hwd on 2015/9/21.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class<?> cls = p.getClass();
        Method m = cls.getDeclaredMethod("say");
        m.setAccessible(true);
        m.invoke(p);
        System.out.println("调用完成。。");
    }
}
