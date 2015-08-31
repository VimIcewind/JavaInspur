package com.vimemacs;

/**
 * Created by hwd on 2015/8/31.
 */
public class StaticVarDemo {
    public static void main(String[] args) {
        System.out.println(age);
        if (true) {
            System.out.println(age);
        }
        printAgeStatic();
    }

    public static void printAgeStatic() {
        System.out.println("age is: " + age);
    }

    public void printAge() {
        System.out.println("age is: " + age);
    }

    // static member variable
    static int age = 90;
}
