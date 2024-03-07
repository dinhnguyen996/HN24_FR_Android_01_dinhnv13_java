package com.techja.java1.Assignment3.exp2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số phần tử");
        int n=scanner.nextInt();
        int[] mangSonguyen=new int[n];


        //hàm nhập vào các phần tử
        nhapMang(mangSonguyen);
        // In ra mảng
        System.out.println("Mảng số nguyên:");
        for (int j = 0; j < n; j++) {
            System.out.print(mangSonguyen[j] + " ");
        }

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }

    private static void nhapMang(int[] mangSonguye) {

        for (int i=0;i<mangSonguye.length;i++){
            Scanner scanner1=new Scanner(System.in);
            try {
                System.out.println("nhập vào giá trị phần tử số"+ (i+1));
                int giaTri=scanner1.nextInt();

                // Kiểm tra điều kiện ngoại lệ
                if (giaTri == 100) {
                    System.out.println("Giá trị 100 đã được nhập. Kết thúc chương trình.");
                    mangSonguye[i]=100;
                    break;
                }else {
                    mangSonguye[i]=giaTri;//giá trị tại vị trí i trong mảng = giá trị
                }

            }catch (InputMismatchException e){
                System.out.println("cần nhập số nguyên");
                scanner1.next(); // Xóa bỏ dữ liệu đầu vào không hợp lệ
                i--; // Quay lại nhập giá trị cho phần tử hiện tại
            }
        }
    }

}
