package com.itheima.buffered;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符缓冲流
 *      构造方法:
 *          public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
            public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
        特有方法:
            BufferedReader： public String readLine() : 读一行文字。
            BufferedWriter： public void newLine() : 写一行行分隔符,由系统属性定义符号。
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("c.txt"));
        //定义一个字符串,保存读取的一行文件
        String line = null;
        //循环读取
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        //释放资源
        bufferedReader.close();
    }
}
