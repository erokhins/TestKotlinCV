package org.hanuna.images.test;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        List<Integer> someList = new ArrayList<Integer>();
        for (int i = 0;i < 50000; i++) {
            int r = (int) Math.round(Math.random()*100000);
            someList.add(r);
        }

        Set<Integer> set = new TreeSet<Integer>(someList);

        System.out.println(System.currentTimeMillis() - l);
        l = System.currentTimeMillis();

        set.removeAll(someList);
        System.out.println(System.currentTimeMillis() - l);
    }
}
