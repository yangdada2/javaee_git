package com.itheima.date;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        //创建日期对象
        System.out.println(new Date());
        //创建日期对象吧当前的毫秒值转换成为日期对象
        System.out.println(new Date(0L));
    }
}
