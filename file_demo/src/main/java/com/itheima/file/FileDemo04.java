package com.itheima.file;


import java.io.File;
import java.io.IOException;

/**
 * 创建和删除功能
 *      public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        public boolean delete() ：删除由此File表示的文件或目录。
        public boolean mkdir() ：创建由此File表示的目录。
        public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //文件创建
        File file = new File("aaa.txt");
        System.out.println("文件是否存在 : " + file.exists());
        System.out.println("是否创建 : " + file.createNewFile());
        System.out.println("文件是否存在 : " + file.exists());
        System.out.println("文件是否删除 : " + file.delete());

        //目录的创建
        File f1 = new File("newDir");
        System.out.println("目录是否存在 : " + f1.exists());
        System.out.println("目录是创建 : " + f1.mkdir());
        System.out.println("目录是否存在 : " + f1.exists());
        System.out.println("目录是否删除 : " + f1.delete());

        //创建多级目录
        File f2 = new File("newDira\\newDirb");
        System.out.println("多级目录是否创建成功 : " + f2.mkdir());
        File f3 = new File("newDira\\newDirb");
        System.out.println("多级目录是否创建成功 : " + f3.mkdirs());

        //文件的删除
        System.out.println("多级目录是否删除成功 : " + f3.delete());
    }
}
