package org.example;

import java.util.Random;

// 반환값이 1개 매개변수가 3개인..
interface AA{
    int doA(int a,int b,int c);
}

interface AAString{
    int doA(String a,String b, String c);
}

interface AAAString{
    int doA();
}

// 반환값이 있고 매개변수가 없는 함수
interface RAN {
    int ran();

   default int doA(){return 10;};
}

public class Ex02 {
    public static void main(String[] args) {

        RAN ran = () -> new Random().nextInt(50);
        for (int i = 0; i < 10; i++)
            System.out.println(ran.ran());

        System.out.println();

        Random random = new Random();
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(50));


    }
}
