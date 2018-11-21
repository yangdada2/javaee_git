package com.itheima;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    /**
     * java.util.HashSet 是Set 接口的一个实现类，它所存储的元素是不可重复的，并且元素都是无序的(即存取顺序
        不一致)。java.util.HashSet 底层的实现其实是一个java.util.HashMap 支持，由于我们暂时还未学习，先做了
        解。
        HashSet 是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。保证元素唯一性
        的方式依赖于： hashCode 与equals 方法。
     * @param args
     */
    public static void main(String[] args) {
        //创建set对象
        Set<String> set = new HashSet<String>();

        //添加元素 由于hastSet集合石保证元素的唯一性 所以说第二个cba没有存储进去
        set.add(new String("cba"));
        set.add("bca");
        set.add("abc");
        set.add("cba");

        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
