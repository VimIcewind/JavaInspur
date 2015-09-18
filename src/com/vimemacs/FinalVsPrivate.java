package com.vimemacs;

import java.io.IOException;

/**
 * Created by hwd on 2015/9/18.
 */
public class FinalVsPrivate {
    public static void main(String[] args) throws IOException {
        One1 one = new One1();
        one = null;
        System.gc();
        System.in.read();
    }
}

class One1 {
    public void finalize() throws Throwable {
        System.out.println("game over...");
    }
}
