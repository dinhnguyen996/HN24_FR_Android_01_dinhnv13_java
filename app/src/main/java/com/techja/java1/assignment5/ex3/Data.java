package com.techja.java1.assignment5.ex3;

public class Data {
    private int total = 0; // Biến tổng

    // Phương thức cộng thêm một giá trị vào total
    public synchronized void add(int value) {
        this.total += value;
        System.out.println("Tổng hiện tại: " + this.total + " giá trị thêm vào: " + value);

        if (this.total <= -100 || this.total >= 100) {
            System.out.println("Tổng vượt quá giới hạn cho phép,dừng luồng");
            System.exit(0);
        }
    }
}
