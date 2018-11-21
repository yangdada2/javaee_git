package com.itheima.stringbuider;

public class StringDemo02 {
    /**
     * append方法具有多种重载形式，可以接收任意类型的参数。任何数据作为参数都会将对应的字符串内容添加到
     * StringBuilder中
     * @param args
     */
    public static void main(String[] args) {
        //创建对象
        StringBuilder builder = new StringBuilder();
        //public StringBuilder append(任意类型)
        StringBuilder builder2 = builder.append("hello");
        //对比一下
        System.out.println("builder:"+builder);
        System.out.println("builder2:"+builder2);
        System.out.println(builder == builder2); //true
        // 可以添加 任何类型
        builder.append("hello");
        builder.append("world");
        builder.append(true);
        builder.append(100);
        // 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
        //链式编程
        builder.append("hello").append("world").append(true).append(100);
        System.out.println("builder:"+builder);
    }
}
