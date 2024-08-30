package org.example;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(localDate.getYear(), 12, 25);
        System.out.println(localDate1);

        System.out.println("localDate1.minusDays(1) = "+localDate1.minusDays(1));
        System.out.println("localDate1.minusDays(2) = "+localDate1.minusDays(2));

        //달력, 윤년 2월29일, 2월 28일 쉽게 출력가능
    }
}
