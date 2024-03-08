package com.techja.java1.Assignment3.exp5;

public class Main5 {
    public static void main(String[] args) {
        try {
            //tạo đối tượng
            Object obJect=null;

            //gọi phương thức thao tác tới object
            int lengthObject=obJect.toString().length();

        }catch (NullPointerException e){
            System.out.println("Lỗi NullPointerException : Đối tượng null ");
        }
    }
}
