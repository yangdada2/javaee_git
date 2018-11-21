package com.itheima.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {

    /**
     * 泛型的使用
     * @param args
     */
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        coll.add(5);
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()) {
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) iterator.next();
            System.out.println(str.length());
        }
    }
}
