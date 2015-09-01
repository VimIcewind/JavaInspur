package com.vimemacs.method;

import com.vimemacs.method.One;
import org.junit.Test;

/**
 * Created by hwd on 2015/9/1.
 */
public class Two extends One {
    public static void main(String[] args) {
        One o = new One();
        o.f();
        o.f2();
        o.f3();
//        o.f4();

        Two t = new Two();
        t.f();
        t.f2();
        t.f3();
//        t.f4();
    }

    @Test
    public void abc() {
        System.out.println("Start");
        for (int i = 0; i < 3; i++) {
            System.out.println("i is: " + i);
           if (true) {
               if (true) {
                   if(true) {
                       return;
                   }
               }
           }
        }
        System.out.println("Done");
    }

    public int aaa() {
        return 200;
    }

    public String str() {
        return "dsfsdf";
    }

    public One getOne() {
        return new One();
    }

    @Test
    public void a3() throws Exception {
        if (false) {
            System.out.println("Can Never be print!");
        } else {
            throw new Exception("You are wrong!");
        }
    }
}
