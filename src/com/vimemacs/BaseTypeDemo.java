package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/8/31.
 */
public class BaseTypeDemo {
    public static void main(String[] args) {
        int i = 90;
        byte b = 99;
        float f = 90.2F;
        double d = 86.23D;
        boolean boo = true;
        short s = 899;
        long l = 45L;
        short s1 = (short) i;

        i = (int)l;

        int abc = 129;
        byte b2 = (byte)abc;
        System.out.println(b2);
    }

    @Test
    public void testOperation() {
        byte a1 = 2;
        byte a2 = 1;
        byte a3 = (byte)(a1 + a2);
        int a4 = a1 + a2;
        System.out.println(a3 + "," + a4);

        long l = 8;
        long x = l + 1;
        int y = (int)(1 + l);
    }
}
