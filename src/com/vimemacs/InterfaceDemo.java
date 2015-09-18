package com.vimemacs;

/**
 * Created by hwd on 2015/9/18.
 */
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

interface Animal2 {
    void eat();
    abstract void run();
}

interface SomeThing {
    void shape();
}

class AAA {

}

abstract class BBB {

}

class Dog3 extends BBB implements Animal2, SomeThing {
    @Override
    public void eat() {
        System.out.println("aaa");
    }

    @Override
    public void run() {
        System.out.println("rrr");
    }

    @Override
    public void shape() {
        System.out.println("sss");
    }
}

interface A1 {
    void a1();
}

interface A2 {
    void a2();
}

interface A3 extends A1, A2 {
    void a3();
}

class A4 implements A3 {
    public void a1() {

    }
    public void a2() {

    }
    public void a3() {

    }
}

interface A5 {
    void a5();
}

interface A6 {
    void a6();
}

interface A7 extends A5, A6 {
    void a5();
    void a6();
}

abstract class A8 implements A7 {
    public abstract void a8();
}

class A9 extends A8 {

    @Override
    public void a8() {

    }

    @Override
    public void a5() {

    }

    @Override
    public void a6() {

    }
}