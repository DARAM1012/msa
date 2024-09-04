package org.example;

public class Ex01 {
    public static void main(String[] args) {
        Runnable run1 = () -> {
            try {

                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + " " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
       Thread th1 = new Thread(run1);
       th1.start();

        Runnable run2 = () -> {
            try {

                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    if (i % 3 == 0)
                        System.out.println(Thread.currentThread().getName() + " " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        Thread th2 = new Thread(run2);
        th2.start();

        try {

            for (int i = 0; i < 100; i++) {
                Thread.sleep(150);
                if (i % 2 == 1)
                    System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
