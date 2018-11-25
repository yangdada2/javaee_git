package com.itheima.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo03 {
    public static void main(String[] args) throws IOException {
        //使用文件名创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //字符串转换成为字节数组
        byte[] b = "黑马程序员".getBytes();

        fos.write(b);

        //释放资源
        fos.close();

    }
}
