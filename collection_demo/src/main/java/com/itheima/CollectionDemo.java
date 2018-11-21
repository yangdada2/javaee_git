package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

    /**
     * 工具类collections的用法 批量添加数据(addAll())和排序该集合 (sort(集合对象))
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        //原来的写法
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        //采用工具类往集合中添加数据
        Collections.addAll(integers,6,7,8,10,9);
        System.out.println(integers);

        //排序方法
        Collections.sort(integers);
        System.out.println(integers);
    }
}
