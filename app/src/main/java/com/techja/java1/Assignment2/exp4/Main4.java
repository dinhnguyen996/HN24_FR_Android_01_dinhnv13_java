package com.techja.java1.Assignment2.exp4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        KhuPho khuPho=new KhuPho();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số hộ dân: ");
        int n = scanner.nextInt();//lấy dữ liệu cho vòng for chạy bao nhiêu lần để nhập dữ liệu
        scanner.nextLine(); // Loại bỏ newline
        //thực hien vòng for nhập số hộ dân và số nhà lần lượt
        for (int i = 0; i < n; i++) {
            System.out.println("Hộ dân thứ " + (i + 1) + ":");
            System.out.print("Số nhà: ");
            String soNha = scanner.nextLine();//nhập số nhà

            ArrayList<Nguoi> danhSachThanhVien = new ArrayList<>();//khởi tạo ds chứa thành viên
            System.out.print("Số thành viên: ");
            int soThanhVien = scanner.nextInt();
            scanner.nextLine(); // Loại bỏ newline

            //thực hiện vòng for để nhập thông tin của từng thành vien 1
            for (int j = 0; j < soThanhVien; j++) {
                System.out.println("Thành viên thứ " + (j + 1) + ":");
                System.out.print("Họ tên: ");
                String hoTen = scanner.nextLine();

                System.out.print("Tuổi: ");
                int tuoi = scanner.nextInt();

                scanner.nextLine(); // Loại bỏ newline

                System.out.print("Nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();

                System.out.print("Số CMND: ");
                String soCMND = scanner.nextLine();
                //sau khi nhập xong thêm thanh vien dó vào danhSachThanhVien
                danhSachThanhVien.add(new Nguoi(hoTen, tuoi, ngheNghiep, soCMND));
            }
            //khởi tao hộ gia đình với các thông tin vừa nhập
            HoGiaDinh hoGiaDinh = new HoGiaDinh(soThanhVien, soNha, danhSachThanhVien);
            khuPho.themHoGiaDinh(hoGiaDinh);//thêm hộ gia đình vào khu phố
        }

        System.out.println("Thông tin các hộ trong khu phố:");
        khuPho.hienThiThongTin();//hiển thị tất cả thông tin các hộ gia đình năm trong khu phố

    }
}
