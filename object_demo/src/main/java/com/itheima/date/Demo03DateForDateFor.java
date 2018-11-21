package com.itheima.date;

import jdk.internal.dynalink.beans.StaticClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 把date对象转换成为String
 */
public class Demo03DateForDateFor {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String format = dateFormat.format(date);
        System.out.println(format);
        Date date1 = testStringForDate();
        System.out.println(date1);
        System.out.println(testDateforBirthday());
    }

    /**
     * 把日期类型的字符串转换成为Date对象
     * @return
     * @throws ParseException
     */
    private static Date testStringForDate() throws ParseException {
        SimpleDateFormat yyyy年MM月dd日 = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2018年12月11日";
        Date parse = yyyy年MM月dd日.parse(str);
        return parse;
    }

    /**
     * 计算出一个人已经出生了多少天了
     */
    private static long testDateforBirthday() throws ParseException {
        Date date = new Date();
        long time = date.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String birthday = "1994年03月30日";
        Date parse = dateFormat.parse(birthday);
        long l = date.getTime() - parse.getTime();
        return l/1000L/60L/60L/24L;
    }
}
