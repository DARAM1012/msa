package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream.of(11,22,33,44,55)
                .forEach(System.out::println);

        Stream.of("So Simple","So So","11,22,33")
                .forEach(System.out::println);

        List<String> list = Arrays.asList("11","22","33","44");
        List<String> list2 = Arrays.asList("11","22","33","44");

        Stream.of(list,list2)
                .forEach(System.out::println);

        Stream.of(list,list2)
                .flatMapToInt(strings -> strings.stream().mapToInt(s->Integer.parseInt(s)))
                .forEach(System.out::println);

       int result = Stream.of(list,list2)
               .flatMapToInt(strings -> strings.stream().mapToInt(s->Integer.parseInt(s)))
               .sum();

        System.out.println("result = "+result);

    }
}
