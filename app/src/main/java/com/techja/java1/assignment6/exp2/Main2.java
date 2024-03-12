package com.techja.java1.assignment6.exp2;
/*2.Viết chương trình nhập vào thông tin khách hàng rồi ghi đè lên file file
chứa thông tin khách hàng có sẵn. Biết rằng thông tin của khách hàng
được lưu trữ trong file khachhang.txt như bên dưới, mỗi dòng là thông tin
của 1 khách hàng bao gồm: mã khách hàng, họ tên số điện thoại, các
thông tin cách nhau 1 khoảng cách*/


import com.techja.java1.assignment6.exp1.Link;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Đường dẫn đến file chứa thông tin khách hàng
        String filePath = Link.linkCut +"assignment6/exp2/khachhang.txt";

        // Nhập thông tin khách hàng từ người dùng
        Customer customer = inputCustomerInfo();

        // Ghi đè thông tin khách hàng vào file
        writeCustomerToFile(filePath, customer);

        // Hiển thị thông tin khách hàng sau khi đã ghi vào file
        System.out.println("Thông tin khách hàng sau khi đã ghi vào file:");
        displayCustomerInfo(filePath);
    }

    private static Customer inputCustomerInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = scanner.next();

        System.out.println("Nhập họ tên khách hàng:");
        String hoTen = scanner.next();

        System.out.println("Nhập số điện thoại (chỉ nhập số và không quá 10 số):");
        String soDienThoai = scanner.next();

        return new Customer(maKhachHang, hoTen, soDienThoai);
    }

    private static void writeCustomerToFile(String filePath, Customer customer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(customer.toString());
            writer.newLine();
            System.out.println("Thông tin khách hàng đã được ghi vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayCustomerInfo(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Customer {
    private String maKhachHang;
    private String hoTen;
    private String soDienThoai;

    public Customer(String maKhachHang, String hoTen, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + hoTen + " " + soDienThoai;
    }
}
