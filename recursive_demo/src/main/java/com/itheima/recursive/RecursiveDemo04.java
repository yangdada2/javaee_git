package com.itheima.recursive;

import java.io.File;

/**
 * 文件搜索
 *      D盘下的suse.flp文件, 并且打印该文件的绝对路径
 */
public class RecursiveDemo04 {
    public static void main(String[] args) {
        File file = new File("D:\\java");
        searchFile(file);
    }

    private static void searchFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            /**
             * 递归的出口
             */
            if (file1.isFile() && file1.getName().equals("suse.flp")) {
                System.out.println(file1.getAbsolutePath());
            }
            if (file1.isDirectory()) {
                searchFile(file1);
            }
        }
    }
}
