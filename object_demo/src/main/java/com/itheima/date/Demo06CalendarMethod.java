package com.itheima.date;

import java.util.Calendar;

public class Demo06CalendarMethod {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int dayOfMonth = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        //使用add方法
        instance.add(Calendar.DAY_OF_MONTH, 2); // 加2天
        instance.add(Calendar.YEAR, -3); // 减3年
        int year1 = instance.get(Calendar.YEAR);
        int month1 = instance.get(Calendar.MONTH);
        int dayOfMonth1 = instance.get(Calendar.DAY_OF_MONTH);
        System.out.print(year1 + "年" + month1 + "月" + dayOfMonth1 + "日"); // 2015年1月18日;
    }
}
