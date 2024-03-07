package com.techja.java1.Assignment2.exp4;

import java.util.ArrayList;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCMND;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", soCMND='" + soCMND + '\'' +
                '}';
    }

}
class HoGiaDinh{
    private int soThanhVien;
    private String soNha;
    private ArrayList<Nguoi> danhSachThanhVien;

    public HoGiaDinh(int soThanhVien, String soNha, ArrayList<Nguoi> danhSachThanhVien) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.danhSachThanhVien = danhSachThanhVien;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "soThanhVien=" + soThanhVien +
                ", soNha='" + soNha + '\'' +
                ", danhSachThanhVien=" + danhSachThanhVien +
                '}';
    }

}
class KhuPho{
    private ArrayList<HoGiaDinh> danhSachHoGiaDinh;

    public KhuPho() {
        this.danhSachHoGiaDinh = new ArrayList<>();//khởi tạo danh sách ban đầu sẳn sàng thêm hộ gia đình

    }
    //thêm hộ gia đình
    public void themHoGiaDinh(HoGiaDinh hoGiaDinh) {
        this.danhSachHoGiaDinh.add(hoGiaDinh);
    }
    //hiển thị hộ gia đình
    public void hienThiThongTin() {
        for (HoGiaDinh hoGiaDinh : danhSachHoGiaDinh) {
            System.out.println(hoGiaDinh.toString());
        }
    }
}
