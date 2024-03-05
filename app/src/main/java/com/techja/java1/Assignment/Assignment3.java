package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberA,numberB;
        char calculation;
        System.out.println("Nhập vào số A");
        numberA=scanner.nextInt();
        System.out.println("Nhập vào số B");
        numberB=scanner.nextInt();
        System.out.println("Nhập vào phép toán cần tính");
        calculation=scanner.next().charAt(0);
        int result=0;
        switch (calculation){
            case '+':
            result=numberA + numberB;
            break;
            case '-':
                result=numberA - numberB;
                break;
            case '*':
                result=numberA * numberB;
                break;
            case '/':
                if (numberB !=0){
                    result=numberA / numberB;

                }else {
                    System.out.println("lỗi không chia được cho 0");
                    return;
                }
                break;
            default:
                System.out.println("Nhập sai phép tính");
                return;

        }

        System.out.println("Kết quả của phép toán là "+ result);
    }
}
