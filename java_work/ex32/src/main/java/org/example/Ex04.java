package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex04 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime f1 = LocalDateTime.of(2025, 1, 25, 11, 20);
        LocalDateTime f2 = LocalDateTime.of(2025, 1, 1, 8, 20);

        // 오늘과 1월 25일 날짜 차이
        Period period = Period.between(f1.toLocalDate(), f1.toLocalDate());
        System.out.println(period);

        //f1(1월25일 11시20분) f2(1월 30일 8시 20분) 시간 차이
        Duration duration = Duration.between(f1.toLocalTime(), f2.toLocalTime());
        System.out.println(duration);
    }
}



