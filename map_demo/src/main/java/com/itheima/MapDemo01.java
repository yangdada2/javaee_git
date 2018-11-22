package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合遍历键找值得方法
 *      键找值方式：即通过元素中的键，获取键所对应的值
 *          分析步骤:
 *                     1.获取map中所有的键,由于键是唯一的,所以返回的一个set类型的集合
 *                     2.遍历set集合获取所有的键
 *                     3.根据键找到对应map的值
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建map集合
        Map<String,String> map = new HashMap<String, String>();

        //添加元素
        map.put("胡歌","霍建华");
        map.put("郭德纲","于谦");
        map.put("薛之谦","大张伟");

        //获取所有的键, 获取键集
        Set<String> set = map.keySet();

        for (String s : set) {
            String s1 = map.get(s);
            System.out.println(s1);
        }
    }
}
