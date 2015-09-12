package com.vimemacs;

import org.junit.Test;

import java.text.Collator;
import java.util.*;

/**
 * Created by hwd on 2015/9/10.
 */
public class ArrayDemo {
    @Test
    public void array1() {
        int[] ages = new int[2];
        ages[1] = 90;
        ages[0] = 100;
        // 遍历显示
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        System.out.println("------------------------------");
        for (int age : ages) {
            System.out.println("age: " + age);
        }
    }

    @Test
    public void array2() {
        int[][] ages = {
                {2, 4, 6},
                {7, 8, 9, 10},
                {11, 12, 23, 14, 15, 16, 17}
        };
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.println(ages[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void array3() {
        int[][] ages = new int[3][3];
        ages[0][0] = 1;
        ages[0][1] = 2;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.println(ages[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void arrrayFinal() {
        final int[] x = new int[]{1, 2};
        x[0] = 100;
        System.out.println(x[0]);
    }

    @Test
    public void arrayBobbleSort() {
        int[] num = {5675, 4564, 76, 435432, 10, 9, 8, 3253, 214, 345, 324};
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
            for (int a : num) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void arraySort() {
        int[] num = {5675, 4564, 76, 435432, 10, 9, 8, 3253, 214, 345, 324};
        for (int a : num) {
            System.out.print(a + "\t");
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            int small = num[i];
            int index = -1;
            for (int j = i + 1; j < num.length; j++) {
                if (small > num[j]) {
                    small = num[j];
                    index = j;
                }
            }
            if (index != -1) {
                num[index] = num[i];
                num[i] = small;
            }
            for (int a : num) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void arraySortByArrays() {
        int[] num = {5675, 4564, 76, 435432, 10, 9, 8, 3253, 214, 345, 324};
        for (int a:num) {
            System.out.print(a + "\t");
        }
        System.out.println();
        Arrays.sort(num);
        for (int a:num) {
            System.out.print(a + "\t");
        }
    }

    @Test
    public void init() throws Exception {
        int[] a = new int[2];
        Arrays.fill(a, 100);
        System.out.println(Arrays.toString(a));

        int[] ab = {1, 2, 3, 4};
        int[] a2 = Arrays.copyOf(ab, 6);
        System.out.println(Arrays.toString(a2));
    }

    @Test
    public void compare() throws Exception {
        int[] a = {1, 2};
        int[] b = {1, 2};
        boolean boo1 = a==b;
        boolean boo = a.equals(b);
        System.out.println(boo);

        boolean boo3 = Arrays.equals(a, b);
        System.out.println("boo3 is: " + boo3);
    }

    @Test
    public void sortCn() throws Exception {
        String[] str = {"王健", "张三", "李四", "赵七", "阿三"};

        Comparator com = Collator.getInstance(Locale.CHINA);
        Arrays.sort(str, com);
        for (String nm:str) {
            System.out.println(nm + "\t");
        }
        System.out.println();

        List list = Arrays.asList(str);
        Collections.reverse(list);
        for (Object nm:list) {
            System.out.println(nm + "\t");
        }
    }
}
