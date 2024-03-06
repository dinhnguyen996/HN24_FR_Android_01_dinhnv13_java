package com.techja.java1.Assignment2.exp3;

public abstract class Phong {
   protected String loaiPhong;
   protected   int soDem;
   protected double phiDichVu;

    public Phong(String loaiPhong, int soDem, double phiDichVu) {
        this.loaiPhong = loaiPhong;
        this.soDem = soDem;
        this.phiDichVu = phiDichVu;
    }

    public abstract double tinhDoanhThu();
}
//tạo các phòng tương ứng
class PhongD extends Phong{
    public PhongD( int soDem, double phiDichVu) {
        super("Deluxe:", soDem, phiDichVu);//set tên phòng ngay từ đầu
    }

    @Override
    public double tinhDoanhThu() {
        return (soDem*750000+phiDichVu)*1.05;
    }
}
class PhongP extends Phong{
    public PhongP(int soDem, double phiDichVu) {
        super("Premium",soDem, phiDichVu);
    }

    @Override
    public double tinhDoanhThu() {
        return (soDem*500000+phiDichVu)*1.05;
    }
}
class PhongB extends Phong{

    public PhongB( int soDem) {
        super("Business:", soDem, 0);
    }

    @Override
    public double tinhDoanhThu() {
        return soDem*300000;
    }
}
