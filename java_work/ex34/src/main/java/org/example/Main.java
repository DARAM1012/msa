package org.example;


public class Main {
    //java는 싱긍 쓰레드로 이루어져 있지만 다중 쓰레드를 구현할 수 있다.
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++)
                System.out.println(Thread.currentThread().getName() + " " + i);
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        for (int i = 0; i < 1000; i++) {
            Thread th1 = Thread.currentThread();
            System.out.println(th1.getName() + " " + 1);
        }
    }
}