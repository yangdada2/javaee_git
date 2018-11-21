package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo03 {

    /**
     * 自定义工具类Collections 的sort排序的方法
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");

        //排序方法 按照第一个字母的降序 重写Comparator方法 根据hash算法进行加减
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });

        System.out.println(list);
    }
}
