package com.techja.java1.assignment5.exp4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        // Khởi động cả hai threads
        t1.start();
        t2.start();

        // Chờ đợi cả hai threads kết thúc
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // In ra kết quả sau khi cả hai threads đã kết thúc
        System.out.println("Thread 1 generated numbers: " + ((Thread1) t1).getList1());
        System.out.println("Thread 2 generated characters: " + ((Thread2) t2).getList2());
    }
}

class Thread1 extends Thread {
    private final ArrayList<Integer> list1 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 101);
            list1.add(randomNumber);
            System.out.println("Thread 1 tạo ra các số ngẫu nhiên:" + randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }
}

class Thread2 extends Thread {
    private final ArrayList<Character> list2 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1)); // Ký tự ngẫu nhiên từ a đến z
            list2.add(randomChar);
            System.out.println("Thread 2 tạo ra các số ngẫu nhiên:" + randomChar);
            try {
                Thread.sleep(2000); // Dừng 2 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Character> getList2() {
        return list2;
    }
}
