package com.itheima.file;

import java.io.File;


/**
 * file的常用构造方法
 *  public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    public String getPath() ：将此File转换为路径名字符串。
    public String getName() ：返回由此File表示的文件或目录的名称。
    public long length() ：返回由此File表示的文件的长度。
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("d://aaa//bbb.txt");
        System.out.println("文件的绝对路径: " + file.getAbsolutePath());
        System.out.println("文件的构造路径: " + file.getPath());
        System.out.println("文件的名称 : " + file.getName());
        System.out.println("文件的长度 : " + file.length() + "字节");

        File file1 = new File("d://aaa");
        System.out.println("目录的绝对路径 : " + file1.getAbsolutePath());
        System.out.println("目录的构造路径 : " + file1.getPath());
        System.out.println("目录的名称 : " + file1.getName());
        System.out.println("目录的长度 : " + file1.length());
    }
}
