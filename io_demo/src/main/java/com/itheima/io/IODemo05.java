package com.itheima.io;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据追加续写
 *      public FileOutputStream(File file, boolean append) ： 创建文件输出流以写入由指定的 File对象表示的
        文件。
        public FileOutputStream(String name, boolean append) ： 创建文件输出流以指定的名称写入文件。
 */
public class IODemo05 {
    public static void main(String[] args) throws IOException {
        //使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt", true);

        byte [] b = "aasgdasiu".getBytes();

        fos.write(b,1,6);

        fos.close();
    }
}
