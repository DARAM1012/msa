package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instant is1 = Instant.now();

        System.out.println("is1 ="+is1);

        List<String> list = Arrays.asList("11","22","33","44","55");
        list.stream()
                .parallel()
                .forEach(System.out::println);

        for (String temp:list){
            System.out.println(temp);
        }

        Instant is2 = Instant.now();
        System.out.println(is2);

        Duration dt = Duration.between(is1, is2);
        System.out.println(dt);
        System.out.println(dt.toMillis());
    }
}