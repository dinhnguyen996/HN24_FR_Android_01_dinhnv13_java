package com.techja.java1.Assignment2.exp2;

import java.util.ArrayList;

public abstract class KhachHang {
    protected String loaiKhach;
    protected int soLuong;
    protected double donGia;

    public KhachHang(String loaiKhach, int soLuong, double donGia) {
        this.loaiKhach = loaiKhach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public abstract double tinhTien();//phương thức tính tiền
    //Khách loại A
    public static class KhachA extends KhachHang{

        public KhachA(String loaiKhach, int soLuong, double donGia) {
            super(loaiKhach, soLuong, donGia);
        }

        @Override
        public double tinhTien() {
            return soLuong*donGia*1.1; //vat 10% (1.1  tương đương 110%)
        }
    }
    //khách loại B
    public static class KhachB extends KhachHang{
        int soNamThanThiet;

        public KhachB(String loaiKhach, int soLuong, double donGia, int soNamThanThiet) {
            super(loaiKhach, soLuong, donGia);
            this.soNamThanThiet = soNamThanThiet;
        }

        @Override
        public double tinhTien() {
            double phanTramKhuyenMai= Math.min(soNamThanThiet*0.05,0.5);
            return soLuong*donGia*(1-phanTramKhuyenMai)*1.1;//vat 10% (1.1  tương đương 110%)
        }
    }
    //Khách loại c
    public static class KhachC extends KhachHang{

        public KhachC(String loaiKhach, int soLuong, double donGia) {
            super(loaiKhach, soLuong, donGia);
        }

        @Override
        public double tinhTien() {
            return soLuong*donGia*0.5;
        }
    }

}
