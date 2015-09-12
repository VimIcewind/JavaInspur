package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class Parent {
    private String name = "Jack";
    int age = 90;
    protected String addr = "山东济南";
    public String country = "中国";

    public void tel() {
        System.out.println("parent teling...");
    }

    protected void run() {
        System.out.println("runing...");
    }

    void say() {
        System.out.println("say good...");
    }

    private void wc() {
        System.out.println("wc ing...");
    }
}
