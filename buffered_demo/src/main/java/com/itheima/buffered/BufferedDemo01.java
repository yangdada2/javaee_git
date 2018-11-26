package com.itheima.buffered;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 效率测试 : 使用字节流传输数据;
 */
public class BufferedDemo01 {
    public static void main(String[] args) {
        //记录开始时间
        long l = System.currentTimeMillis();
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            //创建流对象
            fos = new FileOutputStream("copy.exe");
            fis = new FileInputStream("D:\\java\\redis\\redis-desktop-manager-0.8.8.384.exe");

            //读写数据i
            int b;
            while((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //记录结束时间
            Long end = System.currentTimeMillis();
            System.out.println("所用时间为: " + (end - l));
            //释放资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
