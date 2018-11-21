package com.itheima;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo02 {

    /**
     * 测试自定义hashset类型
     * @param args
     */
    public static void main(String[] args) {
        //创建集合对象
        Set<Student> set = new HashSet<>();

        //存储
        Student stu = new Student("于谦", 43);
        set.add(stu);
        set.add(new Student("郭德纲", 44));
        set.add(new Student("于谦", 43));
        set.add(new Student("郭麒麟", 23));
        set.add(stu);

        /**
         * 这个重写了hashcode方法和equls方法就会比较地址跟数据是否一样不一样的话hashset才会添加进set 集合当中
         */
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
