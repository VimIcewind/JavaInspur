package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/12.
 */
public class OverLoadBestMatch {
    public void print(int i) {
        System.out.println("int");
    }

    public void print(Integer I) {
        System.out.println("Integer");
    }

    public void print(String str) {
        System.out.println("String");
    }

    @Test
    public void invoke() {
        print(2);
        print(new Integer(3));
        print("Hi");
    }
}
