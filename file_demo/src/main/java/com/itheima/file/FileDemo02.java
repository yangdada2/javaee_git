package com.itheima.file;


import java.io.File;

/**
 * 文件的相对路径和绝对路径
 *      绝对路径: 从盘符开始的路径,这是一个完整的路径
 *      相对路径: 相对于项目目录的路径,这是一个便捷的路径,开发中常用
 */
public class FileDemo02 {
    public static void main(String[] args) {
        //d盘下的bbb.txt文件
        File f1 = new File("D://bbb.txt");
        System.out.println("盘符下的路径 : " + f1.getAbsolutePath());


        //项目下的bbb.txt文件
        File f2 = new File("bbb.txt");
        System.out.println("项目下的路径 : " + f2 .getAbsolutePath());
    }
}
