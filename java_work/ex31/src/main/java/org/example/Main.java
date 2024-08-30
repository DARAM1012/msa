package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // List 1,2,3,4,5,6,7,8,9 생성해서 스트림으로 만들어 가지고
        //1. 그냥 출력
        //2. 홀수,짝수 sum총합 출력하기

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream()
                .forEach(s -> System.out.println(s));

        int result = list.stream()
                .mapToInt(value -> value)
                .sum();

        System.out.println("result =" + result);

        // a = 0, b = 1
        // a = 1, b = 2
        // a = 3, b = 3
        // a = 6, b = 4
        // a = 10, b = 5

        result = list.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(0, (a, b) -> {
                    return a + b;
                });

//                .reduce(0, ((integer, integer2) -> integer + integer2));


        System.out.println("result = " + result);

        result = list.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(0, (a, b) -> {
                    return a + b;
                });

        System.out.println("result = " + result);
    }
}