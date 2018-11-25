package com.itheima.io;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写出字节 write
 */
public class IODemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //写出数据
        fos.write(97);
        fos.write(98);
        fos.write(99);

        //关闭资源
        fos.close();
    }
}
