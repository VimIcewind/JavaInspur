package com.vimemacs;

/**
 * Created by hwd on 2015/8/31.
 */
public class HiMethod {
    public static void main(String[] args) {
        System.out.println("Hi, Method!");
        printHello();
    }

    public static void printHello() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello" + i);
        }
    }
}
