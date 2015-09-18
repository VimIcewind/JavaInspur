package com.vimemacs;

/**
 * Created by hwd on 2015/9/16.
 */
public class FinalMethod {
    public static void main(String[] args) {
        ChildFM cfm = new ChildFM();
    }
}

class ParentFM {
    public void abc() {
        System.out.println("hello..");
    }
}

class ChildFM extends ParentFM{

}
