package com.itheima.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取字节
 */
public class IODemo08 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        //读取数据返回一个字节,读取来过后并不会返回到文件中去
        /*int read = fis.read();
        System.out.println((char)read);
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());*/
        //定义变量保存数据,循环读取数据
        /*int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }*/

        //使用字节数组读取数据
        //定义一个变量
        int len;

        //定义一个字节数组
        byte[] b = new byte[2];

        //循环读取
        while((len = fis.read(b)) != -1) {
            //每次读取后,把数组的有效字节部分,变成字符串打印
            System.out.println(new String(b,0,len));
        }
        //释放资源
        fis.close();
    }
}
