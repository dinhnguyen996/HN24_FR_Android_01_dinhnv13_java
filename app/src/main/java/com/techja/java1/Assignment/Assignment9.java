package com.techja.java1.Assignment;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int number=scanner.nextInt();
        //Kiểm tra xem số nhập vào có lớn hơn 0 hay không
        if (number<=1){
            System.out.println("Hãy nhập vào số nguyên dương lớn hơn 1");
            return;
        }
        if (number==2){
            System.out.println("2 là số nguyên tố");
            return;
        }
        //Kiểm tra số có phải là số nguyên tố hay không
        boolean check=true;//ban đầu coi số nhập là số nguyên tố
        for (int i=number-1;i>1;i--){
            if (number%i==0){
                check=false;//gán lại giá trị cho biến check
                break;
            }
        }
        if (check){
            System.out.println(number + " là số nguyên tố");
        }else {
            System.out.println(number + " không phải là số nguyên tố");

        }
    }

}
