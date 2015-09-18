package com.vimemacs;

/**
 * Created by hwd on 2015/9/18.
 */
public class MultiType {
    public static void main(String[] args) {
        Human human = new HumanSub();

        human.abc();

        System.out.println(human.name);
        System.out.println(human.addr);
        human.say();
    }
}

class Human {
    public String name = "Human";
    public static String addr = "中国北京";

    public void abc() {
        System.out.println("这是Human的abc方法");
    }
    public static void say() {
        System.out.println("这是Human的say方法");
    }
}

class HumanSub extends Human {
    public String name = "HumanSub";
    public static String addr = "山东济南";
    public void abc() {
        System.out.println("这是HumanSub的abc方法");
    }
    public static void say() {
        System.out.println("这是HumanSub的say方法");
    }
}