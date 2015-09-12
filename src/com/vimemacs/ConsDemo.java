package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class ConsDemo {
    public ConsDemo(String str) {
        System.out.println("1:" + str + "," + this);
    }

    public ConsDemo() {
        System.out.println("2:" + this);
    }

    public ConsDemo(int age) {
        System.out.println("3:" + age + "," + this);
    }

    public void aaa() {
        System.out.println("1:aaa" + this);
    }

    public static void main(String[] args) {
        ConsDemo demo1 = new ConsDemo("Jack");
        System.out.println("1:" + demo1);

        ConsDemo demo2 = new ConsDemo();
        System.out.println("2:" + demo2);

        ConsDemo demo3 = new ConsDemo(8);
        System.out.println("3:" + "8" + demo3);

        demo1.aaa();
    }
}
