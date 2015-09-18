package com.vimemacs;

/**
 * Created by hwd on 2015/9/16.
 */
public class EqualsDemo {
    public static void main(String[] args) {
        PersonE p1 = new PersonE("jack");
        PersonE p2 = new PersonE("jack");
        boolean boo = p1 == p2;
        System.out.println(boo);
        boo = p1.equals(p2);
        System.out.println(boo);
    }
}

class PersonE {
    private String name;

    public PersonE(String nm) {
        this.name = nm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            PersonE pp2 = (PersonE) obj;

            PersonE pp1 = this;

            if (pp1.name.equals(pp2.name)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
