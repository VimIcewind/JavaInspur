package com.vimemacs;

/**
 * Created by hwd on 2015/9/1.
 */
public class Boxing {
    public static void main(String[] args) {
        double x = 3.141592653D;
        System.out.println(x);

        Double d = x;
        System.out.println(d);

        double dd = Double.valueOf(x);
        System.out.println(dd);
    }
}
