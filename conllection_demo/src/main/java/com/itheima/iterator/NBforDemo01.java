package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;

public class NBforDemo01 {

    /**
     * 增强for循环(也称for each循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和集合的。它的内部原
     * 理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {3,5,6,87};
        //使用增强for遍历数组
        for(int a : arr){//a代表数组中的每个元素
            System.out.println(a);
        }

        Collection<String> coll = new ArrayList<String>();
        coll.add("小河神");
        coll.add("老河神");
        coll.add("神婆");
        for(String s :coll){
            System.out.println(s);
        }
    }
}
