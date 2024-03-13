package com.techja.java1.finaltest.exp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Nhập số lượng phần tử mảng từ người dùng
        int n = 0;
        while (n <= 0) {
            try {
                System.out.print("Nhập số lượng phần tử của mảng lớn hơn 0: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Số lượng phần tử mảng phải lớn hơn 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập số nguyên.");
                scanner.next(); // Đọc và loại bỏ dữ liệu không hợp lệ
            }
        }

        // Nhập vào mảng các số nguyên từ người dùng
        System.out.println("Nhập vào mảng các số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập số nguyên.");
                scanner.next();
            }
            arr.add(scanner.nextInt());
        }

        // Nhập vào phần tử x cần chèn

        System.out.println("Nhập vào số x cần chèn");
        int x = scanner.nextInt();

        // Thêm phần tử và sắp xếp lại mảng
        addAndSort(arr, x);

        // In ra mảng sau khi đã chèn và sắp xếp
        System.out.println("Mảng sau khi chèn và sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void addAndSort(ArrayList<Integer> arr, int x) {
        // Thêm phần tử x vào mảng
        arr.add(x);
        // Sắp xếp lại mảng theo thứ tự tăng dần
        Collections.sort(arr);
    }
}
