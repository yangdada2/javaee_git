package com.itheima;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 我们知道HashMap保证成对元素唯一，并且查询速度很快，可是成对元素存放进去是没有顺序的，那么我们要保
    证有序，还要速度快怎么办呢？
    所以我们使用HashMap下面的一个子类LinkedMap, 它是链表和哈希组合的数据存储结构
 */
public class LinkedDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("邓超","孙俪");
        linkedHashMap.put("李晨","范冰冰");
        linkedHashMap.put("刘德华","朱丽倩");

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+ " = " + entry.getValue());
        }
    }
}
