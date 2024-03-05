package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.println("nhập vao số năm >=0");
            year = scanner.nextInt();
            if (year<0){
                System.out.println("năm nhập vào không hợp lệ");
            }
        } while (year < 0);//nếu năm nhập vào <0 thì nhập lại
        if (checkYear(year)){
            System.out.println("năm " + year + " là năm nhuận");
        }else {
            System.out.println("năm " + year + " không là năm nhuận");
        }

    }
    //phương thức tính năm nhuận
    public static boolean checkYear(int year){
        return ((year %4 ==0 && year%100 !=0)||(year%400==0));
    }
}
