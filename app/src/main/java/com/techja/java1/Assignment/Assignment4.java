package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month;
        System.out.println("Nhập vào tháng bất kỳ");
        month=scanner.nextInt();
        if (0<month && month<4){
            System.out.println("Tháng"+ month + "thuộc quý 1");
        } else if (4<=month && month<=6) {
            System.out.println("Tháng"+ month + "thuộc quý 2");
        } else if (7<=month && month<=9) {
            System.out.println("Tháng"+ month + "thuộc quý 3");
        } else if (10<=month && month<=12) {
            System.out.println("Tháng"+ month + "thuộc quý 4");
        }else {
            System.out.println("Tháng nhập vào không hợp lệ");
        }
    }
}
