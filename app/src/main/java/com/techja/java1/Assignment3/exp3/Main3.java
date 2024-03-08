package com.techja.java1.Assignment3.exp3;

public class Main3 {
    public static void main(String[] args) {
        int[] mang=new int[5];
        try {
            //cố gắng in ra phần tử thứ 7
            System.out.println("phần tử thứ 7 của mảng là: " + mang[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Truy cập ngoài giớn hạn của mảng, không tồn tại phần tử thứ 7");
        }
    }
}
