package com.techja.java1.Assignment2.exp3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Phong pD=new PhongD(2,100000);
        Phong pP=new PhongP(2,200000);
        Phong pB=new PhongB(2);
        ArrayList<Phong> dsPhong=new ArrayList<>();
        dsPhong.add(pD);
        dsPhong.add(pP);
        dsPhong.add(pB);
        double doanhThuThangTruoc=1100000;//giả sử doanh thu của 1 phòng bất kỳ tháng trước
        for (Phong p:dsPhong){
           double doanhThuTungPhong= p.tinhDoanhThu();
            System.out.println("doanh thư phòng " + p.loaiPhong + " là : "+doanhThuTungPhong);
            if (doanhThuTungPhong>doanhThuThangTruoc*1.25){
                System.out.println( p.loaiPhong+ "là phòng có danh thu vượt trội");
            }
        }
    }
}
