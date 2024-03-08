package com.techja.java1.Assignment3.exp4;

public class Main4 {
    public static void main(String[] args) {
        String stringToConvert="Dữ liệu String";
        try {
            int numberA=Integer.parseInt(stringToConvert);
            double numberB=Double.parseDouble(stringToConvert);
            float numberC=Float.parseFloat(stringToConvert);
            long numberD=Long.parseLong(stringToConvert);

        }catch (NumberFormatException e){
            System.out.println("Không thể ép kiểu sang kiểu số hoc được");
        }
    }
}
