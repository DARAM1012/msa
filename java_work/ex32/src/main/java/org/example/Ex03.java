package org.example;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(15, 13,1);
        System.out.println(localTime1);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration);
    }
}
