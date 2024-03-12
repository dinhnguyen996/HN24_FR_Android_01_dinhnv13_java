package com.techja.java1.assignment6.exp3;

import com.techja.java1.assignment6.exp1.Link;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        String filePath = Link.linkCut +"assignment6/exp3/sinhvien.txt";//link đến file

        String idStudent = inputStudentId();

        // In ra thông tin điểm trung bình của sinh viên
        displayStudentInfo(filePath, idStudent);
    }

    private static String inputStudentId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên:");
        return scanner.next();
    }

    private static void displayStudentInfo(String filePath, String idStudent) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Tách thông tin của sinh viên từ mỗi dòng
                String[] parts = line.split("\\s+");

                // So sánh mã sinh viên và hiển thị thông tin nếu trùng khớp
                if (parts.length >= 3 && parts[0].equals(idStudent)) {
                    String name = parts[1];
                    double mediumScore = Double.parseDouble(parts[2]);

                    System.out.println("Thông tin sinh viên:");

                    System.out.println("Họ tên: " + name);
                    System.out.println("Điểm trung bình: " + mediumScore);
                    return; // Dừng vòng lặp khi tìm thấy sinh viên
                }
            }

            // In thông báo nếu không tìm thấy sinh viên
            System.out.println("Không tìm thấy thông tin cho mã sinh viên " + idStudent);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
