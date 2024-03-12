package com.techja.java1.assignment5.exp5;

public class Main extends Thread {

    private static String[] nameList = {"Nguyen Van Huan", "Nguen Linh Duc", "Nguyen Van Tan", "Vu Viet Tung", "Tran Trung Nghia"};
    private static String[] address = {"Ha Noi", "Hung Yen", "Thanh Hoa", "Ha Tinh", "Quang Ninh"};
    private static final int count = 5;
    private static Object lock = new Object();

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Chương trình đã chạy xong");
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (lock) {
                System.out.println("Tên sinh viên: " + nameList[i] + ", Quê quán: " + address[i]);
                try {

                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}