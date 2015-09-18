package com.vimemacs;

/**
 * Created by hwd on 2015/9/12.
 */
public class SuperDemo {
    public static void main(String[] args) {
        ChildS c = new ChildS();
    }
}

class ParentS {
    public ParentS(String name) {
        System.out.println("ParentS() " + name);
    }
}

class ChildS extends ParentS {
    public ChildS() {
        super("noname");
        System.out.println("ChildS()");
    }

    public ChildS(String nm) {
        super(nm);
    }

    public ChildS(int age) {
        this();
    }
}
