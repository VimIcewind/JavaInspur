package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class StringDemo {
    @Test
    public void testEquals() {
        String name1 = "Jack";
        String name2 = "Jack";
        String name3 = new String("Jack");
        boolean boo1 = name1 == name2;
        System.out.println(boo1);
        boolean boo2 = name1 == name3;
        System.out.println(boo2);
        boolean boo3 = name1.equals(name2);
        boolean boo4 = name1.equals(name3);
        boolean boo5 = name2.equals(name3);
        System.out.println(boo3 + ", " + boo4 + ", " + boo5);
    }

    @Test
    public void testOtherMethod() {
        // 位置计算
        String email = "wang.jian_me@126.com";
//        email = "VimIcewind@gmail.com";
        int start = email.indexOf("@");
        int end = email.indexOf(".", start);
        end = email.lastIndexOf(".");
        System.out.println(start + ", " + end);

        String addr = email.substring(start);
        System.out.println("111:" + addr);
        addr = email.substring(start + 1, end);
        System.out.println("addr is: " + addr);

        System.out.println(email.length());
        System.out.println(email.startsWith("WangJian".toLowerCase()));
        System.out.println(email.endsWith("com"));
        System.out.println(email.equalsIgnoreCase("Wang.jian_Me@126.com"));
        addr = email.substring(12 + 1, 16);
        System.out.println(addr);
    }

    @Test
    public void testRegExp() {
        String w = "www.ora43cle.123.com";
        System.out.println(w);
        w = w.replaceAll("\\d{2,3}", "ABC");
        System.out.println(w);

        String o = "www.oracle.com";
        o = o.replace("oracle", "dwp.oracle");
        System.out.println(o);
        o = o.replace("o", "A");
        System.out.println(o);

    }

    @Test
    public void testCharAt() {
        String name = "VimIcewind";

        int len = name.length();
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }

    }

    @Test
    public void add() {
        int a = 90;
        int b = 89;
        String c = "100";
        Object obj = a + (b + c);
        System.out.println(obj);
    }

    @Test
    public void isEmpty() {
        String addr = "";
        boolean isEmp = addr.isEmpty();
        System.out.println(addr.length());
        System.out.println("Is Empty: " + isEmp);
    }

    @Test
    public void testBytesCode() throws Exception {
        String s = "你";
        System.out.println(s);

        byte[] b = s.getBytes("GBK");
        System.out.println(b[0] + ", " + b[1]);
        System.out.println(b.length);

        byte[] b2 = s.getBytes("UTF-8");
        System.out.println(b2[0] + ", " + b2[1] + ", " + b2[2]);
        System.out.println(b2.length);

        String s2 = new String(b);
        System.out.println("s2 is: " + s2);

        String s3 = new String(b, "UTF-8");
        System.out.println("s3 is: " + s3);
    }

    @Test
    public void split() {
        String name = "Jack#Rose#Mike#Tom#Mary#张三#李四";

        String[] nms = name.split("#");
        System.out.println(nms.length);
        for (int i = 0; i < nms.length; i++) {
            System.out.println(nms[i]);
        }
    }
}

