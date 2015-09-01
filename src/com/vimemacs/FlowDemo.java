package com.vimemacs;

import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class FlowDemo {
    @Test
    public void testIf() {
        if (true) {
            int a = 90;
            System.out.println("true");
        }
    }

    @Test
    public void testFor() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = init(); i < max(); i = add(i)) {
            System.out.println("3: This is output");
        }
    }

    public int init() {
        System.out.println("1: This is Init.");
        return 0;
    }

    public int max() {
        System.out.println("2: This is Compare.");
        return 2;
    }

    public int add(int i) {
        System.out.println("4: This is Add.");
        return i + 1;
    }

    @Test
    public void testBreak() {
        one:
        for (int i = 0; i < 3; i++) {
            two:
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
                break two;
            }
        }
    }

    @Test
    public void testContinue() {
        one:
        for (int i = 0; i < 3; i++) {
            two:
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
                continue one;
            }
        }
    }

    @Test
    public void testDoWhile() {
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= 100);
        System.out.println(sum + ", " + i);
    }

    @Test
    public void testWhile() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
//            sum += i++;
            sum = sum + i;
            i++;
        }
        System.out.println(sum + ", " + i);
    }

    @Test
    public void switchTest() {
        String name = "Jack";
        switch (name) {
            case "Jack":
                System.out.println("10...");
                break;
            case "Tom":
                System.out.println("40...");
                break;
            case "Rose":
                System.out.println("50...");
                break;
            default:
                System.out.println("Don't Know.");
                break;
        }
    }
}
