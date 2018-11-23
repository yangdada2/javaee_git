package com.itheima.utils;

import java.io.FileNotFoundException;

public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            read("b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("over");
    }

    /**
     * 我们这个方法中有异常进行抛出 交给主方法处理
     * @param s
     */
    private static void read(String s) throws FileNotFoundException {
        if (!s.equals("a.txt")) {
            throw new FileNotFoundException("文件不存在");
        }
    }

    /**
     *
     */
}
