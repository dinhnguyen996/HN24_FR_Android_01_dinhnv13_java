package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương");
        int number=scanner.nextInt();
        //Kiểm tra xem số nhập vào có lớn hơn 0 hay không
        if (number<0){
            System.out.println("Hãy nhập vào số nguyên dương");
            return;
        }
        //tính giai thừa
        long factorialResult=calculateFactorial(number);
        System.out.println("giai thừa của "+ number + " là "+ factorialResult);

    }
    //phương thức tính giai thừa
    private static long calculateFactorial(int number) {
        long result=1;
        for (int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }
}
