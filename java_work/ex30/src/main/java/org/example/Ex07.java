package org.example;

import java.util.Optional;

public class Ex07 {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("안녕하세요");

        // map 함수를 flatmap
        // Optional
        // map 함수를 사용하면 Optional로 감싸서 ,,,뭐라구요?
        String str = os1.flatMap(s -> Optional
                .of("바뀌는걸 Optional로 감싸야..."))
                .orElse("EMPTY");

        System.out.println(str);
    }
}
