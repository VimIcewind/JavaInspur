package com.vimemacs.struct;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hwd on 2015/9/21.
 */
public class ListDemo {
    @Test
    public void listDemo() {
        List<String> list = new ArrayList<String>();
        list.add("Jack");
        list.add("Rose");
        list.add("Mike");
        list.add("Jack");
        System.out.println("size:" + list.size());
        String nm = list.remove(0);
        System.out.println("删除的是:" + nm);
        System.out.println("size" + list.size());
        System.out.println("----------------------------");
        for (int i = 0; i < list.size(); i++) {
            nm = list.get(i);
            System.out.println(nm);
        }
        System.out.println("++++++++++++++++++++++++++++");
        for (String nn:list) {
            System.out.println(nn);
        }
        System.out.println("============================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String mm = it.next();
            System.out.println(mm);
        }
    }

    @Test
    public void linked() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addLast("Jack");
        ll.addFirst("Rose");
        ll.addFirst("Tom");
        for (String ss:ll) {
            System.out.println(ss);
        }
    }
}
