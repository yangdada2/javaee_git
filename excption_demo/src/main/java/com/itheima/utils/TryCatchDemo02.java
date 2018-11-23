package com.itheima.utils;

import java.io.FileNotFoundException;


/**
 * 异常注意事项:
 *      1.运行时异常被抛出可以不处理。即不捕获也不声明抛出。
        2.如果父类抛出了多个异常,子类覆盖父类方法时,只能抛出相同的异常或者是他的子集。
        3.父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，
          不能声明抛出
        4.当多异常处理时，捕获处理，前边的类不能是后边类的父类
        5.在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收。
        6.如果finally有return语句,永远返回finally中的结果,避免该情况.
 */
public class TryCatchDemo02 {
    public static void main(String[] args) {
        try {
            read("b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("不管程序如何异常 这里都会执行");
        }
    }

    private static void read(String s) throws FileNotFoundException {
        if (!s.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
