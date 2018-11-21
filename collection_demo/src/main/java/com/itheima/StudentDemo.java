package com.itheima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建四个学生对象 存储到集合中
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",16));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));

        /**
         * 让学生按照年龄排序 降序
         */
        /*Collections.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        /**
         * 让学生按照年龄降序 然后再按照该学生的首字母升序
         */
         Collections.sort(list, new Comparator<Student>() {
             public int compare(Student o1, Student o2) {
                 //年龄降序
                 int result = o2.getAge() - o1.getAge();

                 //第一个判断完成 然后再进行判断第二个按照姓名的首字母降序
                 if (result == 0) {
                     result = o2.getName().charAt(0) - o1.getName().charAt(0);
                 }

                 return result;
             }
         });


        for (Student student : list) {
            System.out.println(student);
        }
    }
}
