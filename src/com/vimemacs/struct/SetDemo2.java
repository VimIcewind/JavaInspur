package com.vimemacs.struct;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by hwd on 2015/9/21.
 */
public class SetDemo2 {
    @Test
    public void testSet() {
        HashSet<String> set = new HashSet<String>();
        set.add("Jack");
        set.add("Rose");
        set.add("Mike");
        for (String o:set) {
            System.out.println(o);
        }
        System.out.println("--------------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String nm = it.next();
            System.out.println(nm);
        }
    }
}
