package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class IntegerConver {
    @Test
    public void conver() {
        int i = -1;

        String str = Integer.toBinaryString(i);
        System.out.println(str + ", " + str.length());

        i = 10;
        str = Integer.toBinaryString(i);
        System.out.println(str + ", " + str.length());

        String hex = Integer.toHexString(i);
        System.out.println(hex);

        String otc = Integer.toOctalString(i);
        System.out.println(otc);
    }
}
