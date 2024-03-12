package com.techja.java1.assignment5.ex3;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        // Luồng 1
        Thread t1 = new Thread(() -> {
            while (true) {

                int randomNum = (int) (Math.random() * -101);
                data.add(randomNum);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        // Luồng 2
        Thread t2 = new Thread(() -> {
            while (true) {
                // Sinh số ngẫu nhiên từ 0 đến 100
                int randomNum = (int) (Math.random() * 101);
                data.add(randomNum);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Bắt đầu các luồng
        t1.start();
        t2.start();
    }
}
