package com.itheima.stringbuider;

public class StringDemo03 {
    /**
     * toString 方法 :
     * 通过toString方法，StringBuilder对象将会转换为不可变的String对象
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder append = new StringBuilder("Hello").append("World").append("Java");
        //调用方法
        String s = append.toString();
        System.out.println(s);
    }
}
