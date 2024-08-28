package org.example;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
