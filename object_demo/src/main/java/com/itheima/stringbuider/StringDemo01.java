package com.itheima.stringbuider;

public class StringDemo01 {
    /**
     * 在API中对String类有这样的描述：字符串是常量，它们的值在创建后不能被更改。
     * @param args
     */
    public static void main(String[] args) {
        String s = "hello";
        s = s + "World";
        System.out.println(s);
    }
}
