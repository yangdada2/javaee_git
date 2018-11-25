package com.itheima.io;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * FileOutputStream类
 *      构造方法:
 *          public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
            public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。

 假如说没有这个对象 这个会自动给你创建文件
 */
public class IODemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        //使用File对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        //使用文件名称创建流对象
        FileOutputStream fos1 = new FileOutputStream("b.txt");
    }
}
