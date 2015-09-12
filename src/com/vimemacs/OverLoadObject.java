package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/12.
 */
public class OverLoadObject {
    public void print(Object o) {
        System.out.println("Hi, " + o + "!");
    }

    @Test
    public void invoke() {
        print(2);
        print(new Integer(3));
        print("Hi");
        print(new Object());
    }
}
