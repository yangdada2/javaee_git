package com.itheima.utils;

import java.io.FileNotFoundException;

public class ThrowDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.txt");
    }

    /**
     * 如果定义功能时有问题发生需要报给给调用者. 可以通过再方法上使用throws关键字进行声明
     * @param s
     */
    private static void read(String s) throws FileNotFoundException {
        //如果不是a.txt文件
        if (!s.equals("a.txt")) {
            throw new FileNotFoundException("文件不存在");
        }
    }
}
