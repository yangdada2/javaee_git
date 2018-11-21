package com.itheima.date;

import java.util.Calendar;

public class Demo04Clender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int i = calendar.get(Calendar.YEAR);
        int i1 = calendar.get(Calendar.MONTH) + 1;
        int i2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i + "年" + i1 + "月" + i2 + "日");
    }
}
