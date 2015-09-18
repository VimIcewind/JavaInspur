package com.vimemacs;

/**
 * Created by hwd on 2015/9/16.
 */
public class ToStringDemo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();

        System.out.println("sheep is:" + sheep);
        System.out.println("sheep is:" + sheep.toString());
        System.out.println("sheep is:" + sheep.hashCode());
    }
}

class Sheep {
    @Override
    public String toString() {
        return "Sheep";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
