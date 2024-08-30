package org.example;

import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        IntStream.of(11,22,33,44)
                .forEach(System.out::print);

        System.out.println();

        IntStream.range(5,10)
                .forEach(System.out::print);

        System.out.println();

        IntStream.rangeClosed(5, 10)
                .forEach(System.out::print);
    }
}
