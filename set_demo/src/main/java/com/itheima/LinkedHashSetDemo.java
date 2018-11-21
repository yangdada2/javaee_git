package com.itheima;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");

        /**
         * 保证元素的唯一性 且这个set集合会有序的存储
         */
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
