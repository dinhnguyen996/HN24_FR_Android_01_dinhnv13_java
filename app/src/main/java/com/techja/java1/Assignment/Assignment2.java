package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int numberA,numberB;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số A");
        numberA=scanner.nextInt();
        System.out.println("nhập vào số B");
        numberB=scanner.nextInt();
        if (numberA>numberB){
            System.out.println("Số lớn nhất là A ="+ numberA);
        } else if (numberA==numberB) {
            System.out.println("số A và B bằng nhau "+ numberA);
        }else {
            System.out.println("Số lớn nhất là B="+ numberB);
        }
    }
}
