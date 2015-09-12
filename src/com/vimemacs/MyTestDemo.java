package com.vimemacs;

import org.junit.*;

/**
 * Created by hwd on 2015/9/1.
 */
public class MyTestDemo {
    @Before
    public void bf() {
        System.out.println("B: 在运行@Test之前");
    }

    @After
    public void af() {
        System.out.println("D: 在运行@Test之后");
    }

    @Test
    public void testAbc1() {
        System.out.println("C: 11111");
    }

    @Test
    public void testABC2() {
        System.out.println("E: 22222");
    }

    @BeforeClass
    public static void bc() {
        System.out.println("A: 在所有方法之前，只运行一次");
    }

    @AfterClass
    public static void ac() {
        System.out.println("F: 在所有方法之后，只运行一次");
    }
}
