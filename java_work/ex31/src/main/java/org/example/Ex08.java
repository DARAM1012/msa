package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Ex08 {
    public static void main(String[] args) {

        // 1,3,5,6,9 홀수만
        List<Integer> oddlist = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 1)
                .collect(() -> new ArrayList<Integer>() //뭘로 모아지게 하고 싶은지 적는 부분..
                        , (list, item) -> list.add(item),
                        (integers, integers2) -> integers.addAll(integers2)
                );

        System.out.println(oddlist);

        // 2,4,6,8,10 짝수만
//        Stream.of(1,2,3,4,5,6,7,8,9,10)

        List<Integer> evenlist = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0)
                .collect(
                        () -> new ArrayList<Integer>() //뭘로 모아지게 하고 싶은지 적는 부분..
                        , (list, item) -> list.add(item)
                        , (integers, integers2) -> {
                        }

                );
        System.out.println(evenlist);

        // 중복제거 10,20,30,40,30 모으는거
        Set<Integer> mset = Stream.of(10, 20, 30, 40, 30)
                .collect(
                        () -> new HashSet<Integer>()
                        , (set, item) -> set.add(item)
                        , (integers, integers2) -> {
                        }
                );
        System.out.println(mset);
    }
}
