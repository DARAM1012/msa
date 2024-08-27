package org.example;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "CCCC", "BBB", "DDDDD");

        String result = list.stream()
                .reduce("", (a, b) -> {
                            if (a.length() > b.length()) return a;
                            else return b;
                        }
                );
        System.out.println(result);

        // 문자열들을 나열해서 출력하고 싶어요
        // AACCCCBBBDDDD

        result = list.stream().reduce("", (a, b) -> a + b);
        System.out.println(result);
    }
}
