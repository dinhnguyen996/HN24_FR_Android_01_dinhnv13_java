package com.techja.java1.assignment5.exp5;

public class StudentInfoPrinter {
    private static final String[] names = {"Nguyen Van Huan", "Nguen Linh Duc", "Nguyen Van Tan", "Vu Viet Tung", "Tran Trung Nghia"};
    private static final String[] address = {"Ha Noi", "Hung Yen", "Thanh Hoa", "Ha Tinh", "Quang Ninh"};
    private static int currentIndex = -1; // Chưa in ra gì
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                for (int i = 0; i < names.length; i++) {
                    synchronized (lock) {
                        int randomIndex = (int) (Math.random() * names.length);
                        System.out.println("Họ và tên: " + names[randomIndex]);
                        currentIndex = randomIndex;
                        lock.notify(); // Thông báo thread 2 thực thi
                        if (i < names.length - 1) { // Đợi cho tới lần cuối cùng
                            lock.wait(); // Đợi thread 2 thông báo
                        }
                    }
                    Thread.sleep(1000); // Đợi 1 giây
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                for (int i = 0; i < address.length; i++) {
                    synchronized (lock) {
                        while (currentIndex == -1) { // Đợi cho tới khi thread 1 in ra tên
                            lock.wait(); // Đợi thread 1 thông báo
                        }
                        System.out.println("Quê quán: " + address[currentIndex]);
                        currentIndex = -1; // Reset sau khi đã in
                        if (i < address.length - 1) {
                            lock.notify(); // Thông báo thread 1 thực thi tiếp
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}