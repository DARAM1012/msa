package org.example;

import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Ex04 {
    public static void main(String[] args) {
        IntSupplier is = () -> 10 * 10;
        System.out.println(is.getAsInt());

        Supplier<Double> sd = () -> 10.2 * 10.2;
        System.out.println(sd.get());

        Consumer<Integer> 소비자 = integer -> System.out.println(integer * integer);
        소비자.accept(10);

//        Collections.so
    }
}
