package com.techja.java1.assignment6.exp4;

import com.techja.java1.assignment6.exp1.Link;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WirteToFile {
    public static void main(String[] args) {
        String filePath = Link.linkCut +"assignment6/exp4/nhanvien.txt";//link đến file

        try (FileWriter writer = new FileWriter(filePath)) {
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 3; i++) {
                System.out.println("Nhập thông tin nhân viên " + i + ":");
                System.out.print("Mã nhân viên: ");
                String maNV = scanner.nextLine();
                System.out.print("Họ và tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Tuổi: ");
                int tuoi = scanner.nextInt();
                System.out.print("Lương: ");
                float luong = scanner.nextFloat();
                scanner.nextLine(); // Đọc bỏ dòng new line sau nextFloat

                String nhanVienInfo = maNV + "," + hoTen + "," + tuoi + "," + luong + "\n";
                writer.write(nhanVienInfo);
            }

            System.out.println("Thông tin nhân viên đã được ghi vào file nhanvien.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
