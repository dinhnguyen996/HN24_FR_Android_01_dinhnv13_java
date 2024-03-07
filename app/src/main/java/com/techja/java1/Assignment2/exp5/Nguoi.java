package com.techja.java1.Assignment2.exp5;

import java.util.ArrayList;
import java.util.Scanner;

public class Nguoi {
    String hoTen;
    int tuoi;
    String queQuan;

    public Nguoi(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }
}
class HocSinh extends Nguoi {
    public HocSinh(String hoTen, int tuoi, String queQuan) {
        super(hoTen, tuoi, queQuan);
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
class LopHoc {
    ArrayList<HocSinh> danhSachHocSinh;

    public LopHoc(int soLuongHocSinh) {
        this.danhSachHocSinh = new ArrayList<>();
        nhapThongTinHocSinh(soLuongHocSinh);//truyền vao số lượng học sinh
    }

    private void nhapThongTinHocSinh(int soLuongHocSinh) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuongHocSinh; i++) {
            System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự Enter

            System.out.print("Quê quán: ");
            String queQuan = scanner.nextLine();

            HocSinh hocSinh = new HocSinh(hoTen, tuoi, queQuan);
            danhSachHocSinh.add(hocSinh);
        }
    }
    public void hienThiHocSinh20Tuoi() {
        System.out.println("\nCác học sinh 20 tuổi:");
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.tuoi == 20) {
                System.out.println(hocSinh.toString());
            }
        }
    }

    public int demHocSinh23Hanoi() {
        int demHocSinh23Hanoi = 0;
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.tuoi == 23 && hocSinh.queQuan.equalsIgnoreCase("Hà Nội")) {
                demHocSinh23Hanoi++;
            }
        }
        return demHocSinh23Hanoi;
    }
}

