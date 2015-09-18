package com.vimemacs.constractor;

/**
 * Created by hwd on 2015/9/18.
 */
public class PrivateConsDemo {
    public static void main(String[] args) {
        Single1 s1 = Single1.ss;
        Single1 s2 = Single1.ss;
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Single1 {
     private Single1() {
         System.out.println("实例化了");
     }

    public static Single1 ss;

    static {
        ss = new Single1();
    }
}

//class Single1 {
//    private Single1() {
//        System.out.println("实例化了");
//    }
//    private static Single1 ss;
//    public static Single1 newInstance() {
//        if (ss == null) {
//            ss = new Single1();
//        }
//        return ss;
//    }
//}

