package com.itheima.conllection;

import java.util.ArrayList;
import java.util.Collection;

public class ConllectionDemo01 {
    /**
     * Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法
     * public boolean add(E e) ： 把给定的对象添加到当前集合中 。
     * public void clear() :清空集合中所有的元素。
     * public boolean remove(E e) : 把给定的对象在当前集合中删除。
     * public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
     * public boolean isEmpty() : 判断当前集合是否为空。
     * public int size() : 返回集合中元素的个数。
     * public Object[] toArray() : 把集合中的元素，存储到数组中。
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        // 使用方法
        // 添加功能 boolean add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);

        //判断扫地僧是否在集合当中
        System.out.println("扫地僧是否在集合当中 : " + coll.contains("扫地僧"));

        //删除集合当中的元素
        System.out.println("删除石破天 : " + coll.remove("石破天"));
        System.out.println("coll : " + coll);

        //集合当中的元素个数
        System.out.println("集合当中的元素个数 : " + coll.size());

        //转换成为一个Object类型的数组
        Object[] objects = coll.toArray();

        for (Object object : objects) {
            System.out.println(object);
        }

        //清空集合
        coll.clear();
        System.out.println("coll集合当中的内容 : " + coll);

        //判断是否为空
        System.out.println("当前集合是否为null :" + coll.isEmpty());
    }
}
