package com.itheima.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo02DateFormat {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat);
    }
}
