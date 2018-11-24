package com.itheim.lambda;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 有参有返回值的情况下lambda的书写
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20)
        };

        //匿名内部类  传统写法
        /*Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        };*/

        /**
         * lambda表达式的写法 :
         *      代码分析:
         *              1.为了排序， Arrays.sort 方法需要排序规则，即Comparator 接口的实例，抽象方法compare 是关键；
                        2.为了指定compare 的方法体，不得不需要Comparator 接口的实现类；
                        3.为了省去定义一个ComparatorImpl 实现类的麻烦，不得不使用匿名内部类；
                        4.必须覆盖重写抽象compare 方法，所以方法名称、方法参数、方法返回值不得不再写一遍，且不能写错；
                        5.实际上，只有参数和方法体才是关键。
         */
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            return o1.getAge()-o2.getAge();
        };
        //数组的排序
        Arrays.sort(persons,comparator);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
