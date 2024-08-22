package org.example;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","TOY","ROBOT","APPLE");
        list = new ArrayList<>(list);
        list.add("추가추가");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        for(String temp:list){
            System.out.println(temp);
        }

        for(Iterator<String> itr=list.iterator(); itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}
