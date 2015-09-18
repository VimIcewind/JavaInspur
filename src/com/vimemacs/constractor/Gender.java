package com.vimemacs.constractor;

/**
 * Created by hwd on 2015/9/18.
 */
public class Gender {
    private String sex;
    private Gender(String sex) {
        this.sex = sex;
    }
    private static Gender MALE;
    public static Gender getMale() {
        if (MALE == null) {
            MALE = new Gender("男");
        }
        return MALE;
    }

    private static Gender FEMALE;
    public static Gender getFemale() {
        if (FEMALE == null) {
            FEMALE = new Gender("女");
        }
        return FEMALE;
    }

    @Override
    public String toString() {
        return "我是:" + sex;
    }
}
