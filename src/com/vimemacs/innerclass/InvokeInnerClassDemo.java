package com.vimemacs.innerclass;

/**
 * Created by hwd on 2015/9/19.
 */
public class InvokeInnerClassDemo {
    public static void main(String[] args) {
        InvokeInnerClassDemo demo = new InvokeInnerClassDemo();

        demo.self();
        Inner1 inner = demo.new Inner1();
        inner.print();
    }

    public void self() {
        System.out.println("这是外部类的方法");
        Inner1 inner1 = this.new Inner1();
        inner1.print();
    }

    class Inner1 {
        public void print() {
            System.out.println("Hello, Inner Class!");
        }
    }
}
