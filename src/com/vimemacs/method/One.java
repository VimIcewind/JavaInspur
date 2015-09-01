package com.vimemacs.method;

/**
 * Created by hwd on 2015/9/1.
 */
public class One {
    // Can be called by any class
    public void f() {

    }

    // Can be called by the classes from same package or child class
    protected void f2() {

    }

    // Can be called by the classed from same package
    void f3() {

    }

    // Can by called by itself
    private void f4() {

    }
}
