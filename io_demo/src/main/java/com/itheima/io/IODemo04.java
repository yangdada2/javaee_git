package com.itheima.io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写出指定长度字节数组
 *          write(byte[] b, int off, int len) ,每次写出从off索引开始，len个字节，
 */
public class IODemo04 {
    public static void main(String[] args) throws IOException {
        //使用文件名创建流对象
        FileOutputStream fileOutputStream = new FileOutputStream("fos.txt");

        byte [] b = "abcdef".getBytes();

        fileOutputStream.write(b,1,3);

        //释放资源
        fileOutputStream.close();
    }
}
