package com.vimemacs.struct;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by hwd on 2015/9/21.
 */
public class MapDemo {
    @Test
    public void map() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "jack");
        map.put("age", "90");
        map.put("addr", "山东济南");
        map.put("tel", "15216410720");
        map.put("phone", "12345678");
        map.remove("name");

        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key);
        }
        System.out.println("--------------------------------");
        Collection<String> col = map.values();
        for (String val:col) {
            System.out.println(val);
        }
        System.out.println("--------------------------------");
        keys = map.keySet();
        for (String kk:keys) {
            System.out.println(kk + "=" + map.get(kk));
        }
        System.out.println("--------------------------------");
        for(Map.Entry<String,String> en:map.entrySet()) {
            System.out.println(en.getKey() + "==" + en.getValue());
        }
    }
}
