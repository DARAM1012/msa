package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {

    public static void main(String[] args) {

//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        };

        TreeSet<Person> treeSet = new TreeSet<>((o1,o2)->o2.getAge()-o1.getAge()); //람다

        treeSet.add(new Person(10,"홍길동"));
        treeSet.add(new Person(5,"장길동"));
        treeSet.add(new Person(20,"정길동"));

        System.out.println(treeSet);
    }
}
