package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class Person {
    private String name;

    public void say() {
        System.out.println("I'm a person!");
    }

    public Person() {
        this("noname");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.toString());
    }
}