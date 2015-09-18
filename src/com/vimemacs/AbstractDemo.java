package com.vimemacs;

/**
 * Created by hwd on 2015/9/18.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        One2 one1 = new One2_1();
        one1.say();
        one1.run();
    }
}

abstract class One2 {
    public abstract void say();
    public void run() {
        System.out.println("running.....");
    }
}

class One2_1 extends One2 {
    public void say() {
        System.out.println("sub...Hello...");
    }
    public void run() {
        System.out.println("sub...running...");
    }
}

class One2_2 extends One2_1 {
    public void hi() {

    }
    public void say() {

    }
}
