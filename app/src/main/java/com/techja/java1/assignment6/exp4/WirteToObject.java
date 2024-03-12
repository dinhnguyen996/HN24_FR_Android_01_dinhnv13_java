package com.techja.java1.assignment6.exp4;

import com.techja.java1.assignment6.exp1.Link;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WirteToObject {
    public static void main(String[] args) {
        String filePath = Link.linkCut +"assignment6/exp4/nhanvien.bin";//link đến file

        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("NV001", "Nguyen Van A", 25, 5000.0f);
        nhanViens[1] = new NhanVien("NV002", "Tran Thi B", 28, 6000.0f);
        nhanViens[2] = new NhanVien("NV003", "Le Van C", 30, 7000.0f);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(nhanViens);
            System.out.println("Mảng nhân viên đã được ghi vào file nhanvien.bin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
