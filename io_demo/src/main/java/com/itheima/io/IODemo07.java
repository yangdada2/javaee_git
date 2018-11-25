package com.itheima.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 字节输入流
 *      public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        public abstract int read() ： 从输入流读取数据的下一个字节。
        public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

 否构造方法
         FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系
         统中的 File对象 file命名。
         FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件
         系统中的路径名 name命名。
 */
public class IODemo07 {
    public static void main(String[] args) throws FileNotFoundException {
        //使用file对象创建流对象
        File file = new File("a.txt");
        FileInputStream fis = new FileInputStream(file);

        //使用文件名称创建留对象
        FileInputStream fis1 = new FileInputStream("b.txt");
    }
}
