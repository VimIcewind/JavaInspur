package com.vimemacs;

import java.util.Scanner;
import java.util.List;

/**
 * Created by hwd on 2015/8/31.
 */
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name");
        String name = sc.nextLine();
        System.out.println("Hi, " + name + "!");
    }
}
