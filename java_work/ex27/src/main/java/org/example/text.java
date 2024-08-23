package org.example;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {

        /*
            숫자 입력 : 2

            2*1 = 2
            2*2 = 4
            2*3 = 6
            ...
            2*9 = 18
         */

//        for (int i = 1; i <7 ; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 2; i < 10; i++) {
            System.out.println(num+"*"+i+"="+i*num);
        }

    }
}
