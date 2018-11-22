package com.itheima;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合遍历键值对方式
 *      操作步骤:
 *                  1,获取Map集合中所有的键值对对象(Entry);
 *                  2.遍历包含键值对对象的entry对象,得到每一个对象
 *                  3.通过对象可以获得该对象的键和对应的值
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建对象
        HashMap<String, String> map = new HashMap<String, String>();

        // 添加元素到集合
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        //获取所有的entry对象
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String, String> entry : set) {
            System.out.println("键为: " + entry.getKey() + ", 值为 : " + entry.getValue());
        }
    }
}
