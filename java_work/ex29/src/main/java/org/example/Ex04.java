package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 1)
                .forEach(s -> System.out.println("나온거 " + s));

        List<Member> list = Arrays.asList(
                new Member(1, "홍길동", 20, "aaa@naver.com", "password"),
                new Member(2, "dl길동", 30, "aaa@naver.com", "password"),
                new Member(3, "rla길동", 40, "aaa@naver.com", "password")
        );

        // 나이에 최종합
        // 나이가 30이상인 사람 출력

        int result = 0;
        for (Member member : list) {
            result += member.getAge();
            System.out.println(member);
        }
        System.out.println("나이에 최종합 =" + result);

        //스트림으로....
        //나이 총합
        
        result = list.stream()
                .mapToInt(s -> s.getAge())
                .sum();

        System.out.println("나이에 최종합 =" + result);

        // 30 이상인 사람 출력
        list.stream()
                .filter(member -> member.getAge() >= 30)
                .forEach(s -> {
                    System.out.println("내용");
                    System.out.println(s);
                });


    }
}
