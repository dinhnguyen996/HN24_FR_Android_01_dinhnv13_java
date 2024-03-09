package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào 1 số bất kỳ");
        number=scanner.nextInt();
        if (0<=number && number<5){
            System.out.println("Rớt");
        } else if (number >=5 && number<=10) {
            System.out.println("Đậu");
        }else {
            System.out.println("Nhâp điểm từ 0 đến 10");
        }
    }
}
