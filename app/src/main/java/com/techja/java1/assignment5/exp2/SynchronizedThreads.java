package com.techja.java1.assignment5.exp2;

import java.util.Random;

public class SynchronizedThreads {
    private static final Object lock = new Object();
    private static volatile boolean shouldStop = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (!shouldStop) {
                synchronized (lock) {
                    char randomChar = generateRandomChar();
                    System.out.println("Thread 1: " + randomChar);
                    lock.notify();  // Thông báo cho Thread 2 là đã sinh xong
                }

                try {
                    Thread.sleep(2000);  // Nghỉ 2 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (!shouldStop) {
                synchronized (lock) {
                    try {
                        lock.wait();  // Đợi Thread 1 thông báo đã sinh xong
                        char uppercaseChar = convertToUppercase();
                        System.out.println("Thread 2: " + uppercaseChar);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(1000);  // Nghỉ 1 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        // Chờ 20 giây
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Dừng cả hai thread
        shouldStop = true;
        synchronized (lock) {
            lock.notifyAll();
        }

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static char generateRandomChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }

    private static char convertToUppercase() {
        Random random = new Random();
        return (char) ('A' + random.nextInt(26));
    }
}