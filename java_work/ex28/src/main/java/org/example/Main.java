package org.example;

import javax.management.ConstructorParameters;
import java.util.*;


class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}


public class Main {
    public static void main(String[] args) {

        // JAVA + DB

        List<String> list = Arrays.asList("ROBOT","BOX","LANDA","AA","기역");
        list = new ArrayList<>(list);

        System.out.println(list);

//        Collections.sort(list, new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });

        System.out.println(list);
    }
}