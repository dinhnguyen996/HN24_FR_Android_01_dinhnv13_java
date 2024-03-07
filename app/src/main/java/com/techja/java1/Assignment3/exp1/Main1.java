package com.techja.java1.Assignment3.exp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("nhập vào số A");
            double numBerA=scanner.nextDouble();
            System.out.println("nhập vào số B");
            double numBerB=scanner.nextDouble();

            //hàm tính toán
            double result=divideNumbers(numBerA,numBerB);
        }catch (InputMismatchException e){
            System.out.println("Lỗi: Bạn cần nhập số thực");
        }catch (ArithmeticException e){
            System.out.println("Lỗi: "+ e.getMessage());
        }finally {
            // Đóng Scanner sau khi sử dụng
            scanner.close();
        }
    }

    private static double divideNumbers(double numBerA, double numBerB) {
        if (numBerB==0){
            throw new ArithmeticException("Không thể thực hiện phép chia cho 0");
        }
        return numBerA/numBerB;
    }
}
