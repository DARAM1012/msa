package org.example;


public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("success");
        
    }
}