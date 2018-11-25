package com.itheima.recursive;


import java.io.File;

/**
 * 递归打印多级目录
 */
public class RecursiveDemo03 {
    public static void main(String[] args) {
        File file = new File("D:\\java\\VMware");
        //调用打印目录的方法
        printDirectory(file);
    }

    private static void printDirectory(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                System.out.println(file1);
                printDirectory(file1);
            }
        }
    }
}
