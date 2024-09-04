package org.example;

class Task extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                if (i % 2 == 0)
                    System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Task task1 = new Task();
        task1.start();

        Task task2 = new Task();
        task2.start();

        Task task3 = new Task();
        task3.start();
    }
}