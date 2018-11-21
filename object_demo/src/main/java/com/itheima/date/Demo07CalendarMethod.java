package com.itheima.date;

import java.util.Calendar;
import java.util.Date;

public class Demo07CalendarMethod {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        System.out.println(time);
    }
}
