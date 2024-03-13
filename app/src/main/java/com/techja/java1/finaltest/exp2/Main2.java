package com.techja.java1.finaltest.exp2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Các số thỏa mãn điều kiện là:");
        for (int i = 10000; i <= 9999999; i++) {
            if (isPrime(i) && isPalindrome(i) && isSumOfDigitsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Kiểm tra số palindrome
    private static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return original == reversed;
    }
    //kiểm tra có tổng các chữ số là số nguyên tố
    private static boolean isSumOfDigitsPrime(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return isPrime(sum);
    }
}
