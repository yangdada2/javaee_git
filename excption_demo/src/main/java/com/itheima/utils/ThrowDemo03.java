package com.itheima.utils;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class ThrowDemo03 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }


    /**
     * 当要抛多个异常时,多个异常之间可以用逗号隔开进行抛出
     * @param s
     */
    private static void read(String s) throws FileNotFoundException,IOException {
        if (!s.equals("a.txt")) {
            throw new FileNotFoundException("文件不存在");
        }

        if (!s.equals("b.txt")) {
            throw new IOException();
        }
    }
}
