package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class Operations {
    @Test
    public void oper() {
        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c);

        int d = a % b;
        System.out.println(d);

        double a1 = 10;
        double b1 = 3;
        double c1 = a1/b1;
        System.out.println(c1);

        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + 0.1;
        }
        System.out.println(">>" + sum);
    }
}
