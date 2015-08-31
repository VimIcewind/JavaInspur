package com.vimemacs;

/**
 * Created by hwd on 2015/8/31.
 */
public class MemVarDemo {
    int age = 100;
    public static void main(String[] args) {
        System.out.println("age is: " + new MemVarDemo().age);

        MemVarDemo demo = new MemVarDemo();
        System.out.println(demo.age);

        demo.printAge();
    }

    private void printAge() {
        System.out.println("printAge: age is: " + age);
    }
}
