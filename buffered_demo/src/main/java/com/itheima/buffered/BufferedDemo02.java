package com.itheima.buffered;


import java.io.*;

/**
 * 效率测试:使用字节缓冲流传输数据
 */
public class BufferedDemo02 {
    public static void main(String[] args) {
        // 记录开始时间
        long start = System.currentTimeMillis();

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //创建流对象
            bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));
            bis = new BufferedInputStream(new FileInputStream("D:\\java\\redis\\redis-desktop-manager-0.8.8.384.exe"));

            //读写数据i
            int b;
            while((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //记录结束时间
            Long end = System.currentTimeMillis();
            System.out.println("所用时间为: " + (end - start));
            //释放资源
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
