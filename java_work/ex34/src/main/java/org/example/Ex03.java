package org.example;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}

public class Ex03 {
    public static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException {
        Runnable run1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Runnable run2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();

            }
        };
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        th1.start();
        th2.start();
//        th1.join();
//        th2.join();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        System.out.println(counter.getCount());
    }
}
