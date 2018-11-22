package com.itheima;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap存储自定义类型键值
 *                  由于map的键必须具有唯一性 所以该学生的对象必须要重写hashcode和equls方法保证唯一性
 */
public class MapDemo03 {

    public static void main(String[] args) {
        HashMap<Student, String> studentStringHashMap = new HashMap<>();

        studentStringHashMap.put(new Student("lisi",28),"上海");
        studentStringHashMap.put(new Student("wangwu",29),"广州");
        studentStringHashMap.put(new Student("zhaoliu",30),"北京");

        Set<Student> set = studentStringHashMap.keySet();
        for (Student student : set) {
            String s = studentStringHashMap.get(student);
            System.out.println(s);
        }
    }
}
