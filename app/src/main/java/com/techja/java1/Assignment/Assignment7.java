package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương");
        int number=scanner.nextInt();
        //Kiểm tra xem số nhập vào có lớn hơn 0 hay không
        if (number<0){
            System.out.println("Hãy nhập vào số nguyên dương");
            return;
        }
        //tính tổng
        long sumResult=calculateSum(number);
        System.out.println("tổng các số chắn nhỏ hơn hoặc bằng"+ number+ " là"+ sumResult);
    }
    //phương thức tính giai thừa
    private static long calculateSum(int number) {
        long result=0;
        for (int i=0;i<=number;i++){
            if (i%2==0){
                result+=i;
            }

        }
        return result;
    }
}
