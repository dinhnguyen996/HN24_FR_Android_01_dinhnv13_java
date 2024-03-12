package com.techja.java1.assignment6.exp5;

import com.techja.java1.assignment6.exp1.Link;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class SinhVien {
    String maSV;
    String hoTen;
    int tuoi;
    String diaChi;
    double diemTB;

    public SinhVien(String maSV, String hoTen, int tuoi, String diaChi, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public String toString() {
        return maSV + " " + hoTen + " " + tuoi + " " + diaChi + " " + diemTB;
    }
}

public class QuanLySinhVien {
    static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm sinh viên.");
            System.out.println("2. Sửa sinh viên theo mã.");
            System.out.println("3. Xóa sinh viên theo mã.");
            System.out.println("4. Sắp xếp sinh viên theo họ tên.");
            System.out.println("5. Sắp xếp sinh viên theo điểm trung bình.");
            System.out.println("6. Hiển thị thông tin tất cả sinh viên.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    sapXepTheoHoTen();
                    break;
                case 5:
                    sapXepTheoDiemTB();
                    break;
                case 6:
                    hienThiDanhSach();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }

    static void themSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String maSV = scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi của sinh viên: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n'
        System.out.print("Nhập địa chỉ của sinh viên: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập điểm trung bình của sinh viên: ");
        double diemTB = scanner.nextDouble();

        SinhVien sv = new SinhVien(maSV, hoTen, tuoi, diaChi, diemTB);
        danhSachSinhVien.add(sv);
        luuFile();
    }

    static void suaSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String maSV = scanner.nextLine();
        boolean timThay = false;

        for (SinhVien sv : danhSachSinhVien) {
            if (sv.maSV.equals(maSV)) {
                System.out.print("Nhập họ tên mới: ");
                sv.hoTen = scanner.nextLine();
                System.out.print("Nhập tuổi mới: ");
                sv.tuoi = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ ký tự '\n'
                System.out.print("Nhập địa chỉ mới: ");
                sv.diaChi = scanner.nextLine();
                System.out.print("Nhập điểm trung bình mới: ");
                sv.diemTB = scanner.nextDouble();

                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên có mã số " + maSV);
        } else {
            luuFile();
        }
    }

    static void xoaSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String maSV = scanner.nextLine();
        boolean timThay = false;

        Iterator<SinhVien> iterator = danhSachSinhVien.iterator();
        while (iterator.hasNext()) {
            SinhVien sv = iterator.next();
            if (sv.maSV.equals(maSV)) {
                iterator.remove();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên có mã số " + maSV);
        } else {
            luuFile();
        }
    }

    static void sapXepTheoHoTen() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.hoTen.compareTo(sv2.hoTen);
            }
        });
        hienThiDanhSach();
    }

    static void sapXepTheoDiemTB() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.diemTB, sv1.diemTB);
            }
        });
        hienThiDanhSach();
    }

    static void hienThiDanhSach() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("Thông tin các sinh viên:");
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println(sv);
            }
        }
    }

    static void luuFile() {
        String filePath = Link.linkCut +"assignment6/exp5/sinhvien.txt";//link đến file

        try {
            PrintWriter writer = new PrintWriter(filePath);
            for (SinhVien sv : danhSachSinhVien) {
                writer.println(sv);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không thể ghi vào tệp tin.");
        }
    }
}
