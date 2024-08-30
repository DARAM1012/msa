package org.example;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex05 {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .stream()
//                .filter(s -> s.contains("America"))
                .sorted();
//                .forEach(System.out::println);

        // 한국 시간 가져오기
        ZonedDateTime korea = ZonedDateTime.now();
        System.out.println(korea);

        ZonedDateTime Paris = ZonedDateTime.of(
                korea.toLocalDateTime()
                , ZoneId.of("Europe/Paris")
        );
        System.out.println(Paris);

        Duration 시차 = Duration.between(korea, Paris);
        System.out.println(시차);
    }
}
