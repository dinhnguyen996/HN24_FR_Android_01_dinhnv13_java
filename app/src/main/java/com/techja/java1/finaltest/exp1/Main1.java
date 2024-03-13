package com.techja.java1.finaltest.exp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
            if (n<=0){
                System.out.println("Nhập sai ,hãy nhập lại");
            }
        }while (n<=0);

        System.out.println("Tổng các chữ số của " + n + " là: " + Number.sum(n));

        ArrayList<Integer> factors = Number.primeFactors(n);
        System.out.print("Phân tích " + n + " thành tích các số nguyên tố: ");
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i < factors.size() - 1) {
                System.out.print(" x ");
            }
        }
        System.out.println();

        ArrayList<Integer> divisors = Number.divisors(n);
        System.out.println("Các ước của " + n + " là: " + divisors);

        Number.printPrimeDivisors(factors);
    }
}