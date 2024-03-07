package com.techja.java1.Assignment2.exp5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng lớp: ");
            int soLuongLop = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ newline

            ArrayList<LopHoc> danhSachLop = new ArrayList<>();

            for (int i = 0; i < soLuongLop; i++) {
                System.out.print("Nhập số lượng học sinh trong lớp thứ " + (i + 1) + ": ");
                int soLuongHocSinh = scanner.nextInt();
                scanner.nextLine(); // Loại bỏ newline

                LopHoc lopHoc = new LopHoc(soLuongHocSinh);//tạo lớp với số lượng học sinh được nhập vào
                danhSachLop.add(lopHoc);
            }

            // Hiển thị các học sinh 20 tuổi và đếm số lượng học sinh 23 tuổi ở Hà Nội
            for (LopHoc lopHoc : danhSachLop) {
                lopHoc.hienThiHocSinh20Tuoi();
                int demHocSinh23Hanoi = lopHoc.demHocSinh23Hanoi();
                System.out.println("Số lượng học sinh có tuổi 23 và quê ở Hà Nội trong lớp: " + demHocSinh23Hanoi);
            }

            // Đóng Scanner sau khi sử dụng
            scanner.close();
        }
}
