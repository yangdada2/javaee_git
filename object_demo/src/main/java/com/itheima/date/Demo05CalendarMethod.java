package com.itheima.date;

import java.util.Calendar;

public class Demo05CalendarMethod {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, 2020);
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int dayOfMonth = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");
    }
}
