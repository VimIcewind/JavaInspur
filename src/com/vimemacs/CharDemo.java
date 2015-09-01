package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class CharDemo {
    @Test
    public void charTest() {
        char c = 'A';
        System.out.println(c);
        int a = c;
        System.out.println(a);
        char c2 = 68;
        System.out.println(c2);
        char c3 = '胡';
        System.out.println(c3);
        char c4 = '\u6d6a';
        System.out.println(c4);
        String wel = "\u4f60\u597d\u540c\u5b66\u5927\u5bb6\u4eca\u5929\u65e9\u4e0a\u3002";
        System.out.println(wel);
    }
}
