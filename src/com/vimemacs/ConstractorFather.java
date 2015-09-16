package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class ConstractorFather {
    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}

class Parent1 {
    public Parent1() {
        System.out.println("Parent1()");
    }
}

class Child1 extends Parent1 {

}
