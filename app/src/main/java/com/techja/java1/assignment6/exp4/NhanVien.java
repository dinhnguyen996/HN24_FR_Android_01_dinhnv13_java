package com.techja.java1.assignment6.exp4;

import java.io.Serializable;

public class NhanVien implements Serializable {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private float luong;

    public NhanVien(String maNV, String hoTen, int tuoi, float luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Mã NV: " + maNV + ", Họ và tên: " + hoTen + ", Tuổi: " + tuoi + ", Lương: " + luong;
    }
}
