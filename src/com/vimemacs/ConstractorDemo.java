package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class ConstractorDemo {
    public ConstractorDemo() {
        System.out.println("此类已经被实例化了..." + this);
    }

    private void aaa() {
        System.out.println("aaaa::" + this);
    }

    public static void main(String[] args) {
        ConstractorDemo demo = new ConstractorDemo();
        demo.aaa();
        System.out.println("Over..." + demo);
    }
}
