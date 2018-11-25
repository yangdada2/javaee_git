package com.itheima.io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写出换行
 *      Windows系统里，换行符号是\r\n
 *
 *      回车符\r 和换行符\n ：
             回车符：回到一行的开头（return）。
            换行符：下一行（newline）。
 */
public class IODemo06 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        // 定义字节数组
        byte[] words = {97,98,99,100,101};

        for (byte b : words) {
            //写出一个字节
            fos.write(b);

            //写出一个换行
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
