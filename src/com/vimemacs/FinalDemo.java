package com.vimemacs;

/**
 * Created by hwd on 2015/8/31.
 */
public class FinalDemo {
    static final int age;
    static {
        age = 90;
        System.out.println("Static code block");
        System.out.println("static final int age : " + age);
    }
    {
        System.out.println("This is no-static code block");
    }

    public static void main(String[] args) {

    }
}
