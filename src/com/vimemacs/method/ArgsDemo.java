package com.vimemacs.method;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class ArgsDemo {
    @Test
    public void a1() {
        int x = 90;
        a2(x, 90.8);
        System.out.println("x is: " + x);
    }

    public void a2(int a, double d) {
        a = 100;
        System.out.println("a is: " + a);
    }

    @Test
    public void b1() {
        int[] b = {1, 2};

        b2(b);
        System.out.println(b[0] + ", " + b[1]);
    }

    public void b2(int[] b) {
        b[0] = 8;
        b[1] = 9;
    }

    @Test
    public void m1() {
        m2(3432, 1, 909);
        m2(1, 2, 3);
        m2(1, 2);
        m2(1);
        m2();
    }

    public void m2(int...a) {
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

    @Test
    public void mm() {
        print(1);
    }

    public void print(int num) {
        System.out.println(num);
        if (num >= 10) {
            return;
        }
        print(++num);
    }
}
