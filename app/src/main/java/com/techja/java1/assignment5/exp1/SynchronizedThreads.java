package com.techja.java1.assignment5.exp1;

import java.util.Random;

public class SynchronizedThreads {
    private static int randomNumber;
    public static void main(String[] args) {
        // Tạo và khởi tạo các thread
        Thread thread1 = new Thread(new RandomNumberGenerator());
        Thread thread2 = new Thread(new SquarePrinter());

        // Bắt đầu chạy các thread
        thread1.start();
        thread2.start();
    }

    // Thread thứ nhất để sinh ngẫu nhiên số và thông báo cho Thread thứ hai
    static class RandomNumberGenerator implements Runnable {
        private final Random random = new Random();

        @Override
        public void run() {
            while (true) {
                // Sinh ngẫu nhiên số từ 1 đến 20
                randomNumber = random.nextInt(20) + 1;
                System.out.println("Thread 1: Sinh số ngẫu nhiên - " + randomNumber);


                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Báo cho Thread thứ hai rằng có số mới được sinh
                synchronized (SynchronizedThreads.class) {
                    SynchronizedThreads.class.notify();
                }
            }
        }
    }

    // Thread thứ hai
    static class SquarePrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                // Đợi cho đến khi có số mới được sinh ra từ Thread thứ nhất
                synchronized (SynchronizedThreads.class) {
                    try {
                        SynchronizedThreads.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // In ra bình phương của số được sinh ra từ thread1
                System.out.println("Thread 2 Bình phương : " + (randomNumber * randomNumber));


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
