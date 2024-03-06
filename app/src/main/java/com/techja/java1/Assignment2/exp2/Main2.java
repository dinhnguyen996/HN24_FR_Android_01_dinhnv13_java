package com.techja.java1.Assignment2.exp2;

import java.util.ArrayList;

public class Main2 {
    //chạy chương trình tính tiền
    public static void  main(String[] args) {
        KhachHang kA=new KhachHang.KhachA("Anh A",10,10.0);
        KhachHang kB=new KhachHang.KhachB("Anh B",15,15.0,18);
        KhachHang kC=new KhachHang.KhachC("Anh C",20,20.0);
        ArrayList<KhachHang> dsKh=new ArrayList<>();
        dsKh.add(kA);
        dsKh.add(kB);
        dsKh.add(kC);
        double tongTienThuDuoc=0;//tiền cửa hàng thu ược
        for (KhachHang kh:dsKh){
            int tongTienThanhToan=(int)kh.tinhTien();//tiền từng loại khách hàng phải trả sau cùng
            System.out.println("Khách hàng "+ kh.loaiKhach +" thanh toán tổng hoá đơn "+" là: "+tongTienThanhToan);
            tongTienThuDuoc +=tongTienThanhToan;
        }
        System.out.println("Tổng tiền cửa hàng thu được là " + tongTienThuDuoc);
    }
}
