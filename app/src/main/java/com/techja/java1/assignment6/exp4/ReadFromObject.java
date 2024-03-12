package com.techja.java1.assignment6.exp4;

import com.techja.java1.assignment6.exp1.Link;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromObject {
    public static void main(String[] args) {
        String filePath = Link.linkCut +"assignment6/exp4/nhanvien.bin";//link đến file

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            NhanVien[] nhanViens = (NhanVien[]) objectInputStream.readObject();
            System.out.println("Thông tin nhân viên từ file nhanvien.bin:");

            for (NhanVien nv : nhanViens) {
                System.out.println(nv);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
