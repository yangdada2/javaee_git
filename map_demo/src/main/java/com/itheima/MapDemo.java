package com.itheima;

import java.util.HashMap;
import java.util.Map;


/**
 * map
 *      Collection 中的集合，元素是孤立存在的（理解为单身），向集合中存储元素采用一个个元素的方式存储。
 *      Map 中的集合，元素是成对存在的(理解为夫妻)。每个元素由键与值两部分组成，通过键可以找对所对应的
 *      值。
 *      Collection 中的集合称为单列集合， Map 中的集合称为双列集合。
 *      需要注意的是， Map 中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。
 */
public class MapDemo {

    public static void main(String[] args) {
        //创建map集合对象
        Map<String,String> map = new HashMap<String, String>();

        //添加数据到集合map中去 使用add
        map.put("黄晓明","杨颖");
        map.put("文章","马伊琍");
        map.put("邓超","孙俪");

        System.out.println(map);

        //根据键来删除对应的键值对
        System.out.println(map.remove("邓超"));
        System.out.println(map);

        ////查看键名为黄晓明所对应的值
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));
    }
}
