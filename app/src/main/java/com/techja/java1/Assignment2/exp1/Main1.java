package com.techja.java1.Assignment2.exp1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Staff staff1=new ProductionStaff("Nguyễn Định","10/05/1996",200);
        Staff staff2=new OfficeStaff("Mai hùng","20/2/2009",25);
        ArrayList<Staff> listStaff=new ArrayList<>();//tạo list chứa đối tượng nhân viên
        listStaff.add(staff1);
        listStaff.add(staff2);
        for (Staff staff:listStaff){
            staff.payRool();//thực hiện tính lương theo từng nhân viên
            System.out.println(staff);//in ra thông tin nhân viên
        }
    }
}
