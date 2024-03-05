package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số a");
        int numberA=scanner.nextInt();
        System.out.println("Nhập vào số b");
        int numberB=scanner.nextInt();
        // Kiểm tra nếu số nhập vào là âm hoặc không phải là số nguyên
        if (numberA <= 0 || numberB <= 0) {
            System.out.println("Vui lòng nhập vào hai số nguyên dương.");
            return;
        }
        //Ước chung lớn nhất của 2 số là
        int gcdResult =gcd(numberA,numberB);
        System.out.println("Ước chung lớn nhất của "+ numberA+ " và "+ numberB + " là: "+ gcdResult);
    }
    //phương thức tính ước chung lớn nhất
    private static int gcd(int numberA,int numberB) {
        for (int i=numberA;i>0;i--){
            if (numberA % i == 0){
                if (numberB % i ==0){
                    //nếu cả numberA và B chia hết cho i thì i là ucln
                    return i;
                }
            }
        }
        return 1;// ước chung nhỏ nhất của 2 số bằng 1
    }
}
