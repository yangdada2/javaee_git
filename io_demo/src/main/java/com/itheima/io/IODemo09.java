package com.itheima.io;

import java.io.*;

/**
 * 图片的拷贝
 */
public class IODemo09 {
    public static void main(String[] args) throws IOException {
        //创建指定位子的图片
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\yang\\Desktop\\c5559b1b79.jpg"));
        //创建输出流
        FileOutputStream fos = new FileOutputStream("copy.jpg");

        //读写数据
        byte[] bytes = new byte[1024];

        //定义长度
        int len;

        //循环读取
        while((len = fis.read(bytes)) !=-1) {
            //循环写入数据
            fos.write(bytes,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
