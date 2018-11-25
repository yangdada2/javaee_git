package com.itheima.file;


import java.io.File;

/**
 * 目录的遍历
 *      public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

 遍历必须是存在的目录要不然会报空指针异常
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File file = new File("D:\\java\\awes");
        //获取当前目录下的文件以及文件的名称
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        //获取当前目录下的文件以及文件夹对象
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
