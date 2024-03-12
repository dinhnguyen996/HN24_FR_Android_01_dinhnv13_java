package com.techja.java1.assignment6.exp4;

import com.techja.java1.assignment6.exp1.Link;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = Link.linkCut +"assignment6/exp4/nhanvien.txt";//link đến file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Thông tin nhân viên từ ReadFromFile");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
