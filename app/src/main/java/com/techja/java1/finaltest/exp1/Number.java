package com.techja.java1.finaltest.exp1;

import java.util.ArrayList;
import java.util.HashSet;

public class Number {
    //a, Tính tổng các chữ số của n
    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //b, Phân tích n thành tích các số nguyên tố
    public static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    //c, Liệt kê các ước của n
    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    //d, Liệt kê các ước của số nguyên tố
    public static void printPrimeDivisors(ArrayList<Integer> primes) {
        HashSet<Integer> uniquePrimes = new HashSet<>(primes); // Loại bỏ các phần tử trùng lặp
        System.out.println("các ước nguyên tố là:");
        for (Integer prime : uniquePrimes) {
            System.out.print(prime + " , ");
        }

    }
}
