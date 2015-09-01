package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class AndDemo {
    public static void main(String[] args) {
        boolean boo2 = a() && b();
        System.out.println("boo2 is: " + boo2);
    }

    private static boolean a() {
        System.out.println("This is a.");
        return false;
    }

    private static boolean b() {
        System.out.println("This is b.");
        return true;
    }

    String name = "Jack";
    @Test
    public void testA() {
        System.out.println(name);
//        if (name == null) {
//            name = "no name";
//        }
        name = (name == null ? "yet no name" : name);
        System.out.println("name is: " + name);
    }
}
