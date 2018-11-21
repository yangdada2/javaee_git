package com.itheima;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        //创建List集合
        List<String> list = new ArrayList<String>();

        //往尾部添加制定数据
        list.add("图图");
        list.add("美美");
        list.add("小小");


        System.out.println(list);

        //add 往制定位置添加 不会进行替换后面元素或者当前元素项后面位置移动一位
        list.add(1,"没头脑");

        System.out.println(list);

        //remove(index) 删除指定位置元素 返回被删除元素
        System.out.println("删除索引位子为2的元素");
        System.out.println(list.remove(2));

        //set(int index, String s) 替换指定索引位置的元素
        list.set(0,"三毛");

        System.out.println(list);

        //获取指定位子元素跟size()方法一起使用 进行for循环遍历
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //还可以使用增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
