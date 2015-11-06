package com.vimemacs;

/**
 * Created by hwd on 2015/8/31.
 */
public class Args {
    public static void main(String[] args) {
        if (args.length==0) {
            System.out.println("No args ......");
        } else {
            int len = args.length;
            for (int i = 0; i < len; i++) {
                System.out.println("The " + i + " arg is " + args[i] + ".");
            }
        }
    }
}
