package com.itheima.buffered;


import java.io.*;
import java.util.HashMap;

/**
 * 文本排序:
 *      1. 逐行读取文本信息。
        2. 解析文本信息到集合中。
        3. 遍历集合，按顺序，写出文本信息。
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<String,String>();
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("c.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        // 读取数据
        String line = null;
        while ((line = br.readLine())!=null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0],split[1]);
        }
        // 释放资源
        br.close();
        // 遍历map集合
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
            // 写出拼接文本
            bw.write(key+"."+value);
            // 写出换行
            bw.newLine();
        }
        // 释放资源
        bw.close();
    }
}
