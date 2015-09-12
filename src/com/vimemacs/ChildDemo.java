package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class ChildDemo {
    public ChildDemo() {
        System.out.println("3:C is init...");
    }

    public static void main(String[] args) {
        ChildDemo cd = new ChildDemo();
        System.out.println("4:over...");
    }
}

class Grandpa {
    public Grandpa() {
        System.out.println("1:g is init....");
    }
}

class Father extends Grandpa {
    public Father() {
        System.out.println("2:f is init....");
    }
}
