package com.itheima.recursive;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过略器的优化
 */
public class RecursiveDemo05 {
    public static void main(String[] args) {
        File file = new File("D:\\java");
        searchFile(file);
    }

    private static void searchFile(File file) {
        //匿名内部类的方式,创建过略器子类对象
        /*File[] files = file.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().equals("suse.flp") || pathname.isDirectory();
            }
        });*/

        //使用lambda表达式进行优化
        File[] files = file.listFiles((f) -> {
            return f.getName().equals("suse.flp") || f.isDirectory();
        });

        //循环打印,是文件打印文件名 不死的话就继续遍历 形成递归
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("文件名: " + file1.getName());
            }else {
                searchFile(file1);
            }
        }
    }
}
