package com.vimemacs;

import java.util.Objects;

/**
 * Created by hwd on 2015/9/17.
 */
public class DynmDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal a2 = new BlackDog();

        Dog dog = (Dog) a2;
        System.out.println("dog:" + dog);

//        Dog2 dog2 = a;
//        Dog2 dog2 = (Dog2) a;
//        System.out.println("dog2 is:" + dog2);

        BlackDog bd = new BlackDog();

//        System.out.println(bd instanceof YellowDog);
        System.out.println(bd instanceof BlackDog);
        System.out.println(bd instanceof Dog);
        System.out.println(bd instanceof Animal);
        System.out.println(bd instanceof Object);
    }
}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}

class BlackDog extends Dog {

}

class YellowDog extends Dog {

}
