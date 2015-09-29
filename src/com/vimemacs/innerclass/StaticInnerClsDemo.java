package com.vimemacs.innerclass;

/**
 * Created by hwd on 2015/9/19.
 */
public class StaticInnerClsDemo {
    public static void main(String[] args) {
        Inner1 innner1 = new Inner1();
        innner1.print();
        new StaticInnerClsDemo().say();
    }

    public void say() {
        Inner1 inner1 = new Inner1();
        inner1.print();
    }

    static class Inner1 {
        public void print() {
            System.out.println("Hello, Inner Class!");
        }
    }
}
