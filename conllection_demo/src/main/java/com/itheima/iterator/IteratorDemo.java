package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    /**
     * iterator迭代器的使用
     * @param args
     */
    public static void main(String[] args) {
        // 使用多态方式 创建对象
        Collection<String> coll = new ArrayList<String>();
        // 添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");

        Iterator<String> iterator = coll.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
