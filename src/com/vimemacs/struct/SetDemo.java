package com.vimemacs.struct;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by hwd on 2015/9/20.
 */
public class SetDemo {
    @Test
    public void hashSetDemo() {
        HashSet hs = new HashSet();
        hs.add("Jack");
        hs.add("Rose");
        hs.add("Mike");
        hs.add("Jack");
        hs.add("Tom");
        hs.add("AAA");
        hs.add("BBB");

        int size = hs.size();
        System.out.println("大小:" + size);
        hs.remove("Rose");
        size = hs.size();
        System.out.println("大小:" + size);

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.println(name);
        }
    }

    @Test
    public void treeSetDemo() {
        TreeSet ts = new TreeSet();
        ts.add("Z");
        ts.add("W");
        ts.add("A");
        ts.add("Jack");
        ts.add("Rose");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            String str = (String)it.next();
            System.out.println(str);
        }
    }

    @Test
    public void addDemo() {
        HashSet hs = new HashSet();
        User u1 = new User("Jack", 10);
        User u2 = new User("Rose", 20);
        User u3 = new User("Jack", 30);
        hs.add(u1);
        hs.add(u2);
        hs.add(u3);
        System.out.println(hs.size());
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }

    class User {
        private String name;
        private int age;

        public User(String nm, int a) {
            this.name = nm;
            this.age = a;
        }

        @Override
        public String toString() {
            return name + "," + age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else {
                if (obj instanceof User) {
                    User u = (User) obj;
                    if (this.name.equals(u.name)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        public int hashCode() {
            return name.hashCode();
        }
    }

    @Test
    public void testSet() {
        HashSet set = new HashSet();
        set.add("Jack");
        set.add(new Integer(99));
        set.add(new User("Jck", 88));
        for (Object o:set) {
            System.out.println(o);
        }
    }

    @Test
    public void testSetStr() {
        HashSet<String> set = new HashSet<String>();
        set.add("Jack");
        set.add("Rose");
        set.add("Mike");
        for (String o:set) {
            System.out.println(o);
        }

    }
}
