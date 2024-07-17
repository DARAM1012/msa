//1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.
//
//입력 >>Hello.java
//        출력
//파일명 Hello
//확장자 java

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "Hello.jave";
        String temp[] = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.java";
        temp =str.split("[A-Z]");

        System.out.println(Arrays.toString(temp));

        str = "안녕3하세요";
        temp = str.split("\\d");

        System.out.println(Arrays.toString(temp));

        if (temp[0].equals("exe"))
            return;
    }
}