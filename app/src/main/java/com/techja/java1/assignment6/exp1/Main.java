package com.techja.java1.assignment6.exp1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/* 1.Viết chương trình nhập đọc một file .txt có sẵn và in ra số lượng từ trong
file. Biết rằng một file có thể có nhiều dòng, mỗi dòng có nhiều từ được
ngăn cách bởi dấu cách và những từ xuất hiện nhiều lần trong file thì chỉ
tính số lượng là 1, không phân biệt chữ hoa và chữ thường.*/

public class Main {
    public static void main(String[] args) {
        // Đường dẫn đến file .txt
        ///Users/mf839/AndroidStudioProjects/java1/app/src/main/java/com/techja/java1/assignment6/exp1
        String filePath = Link.linkCut +"assignment6/exp1/text1.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            Set<String> wordList = new HashSet<>();

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    String cleanedWord = word.toLowerCase();
                    wordList.add(cleanedWord);//chỉ lưu những từ chưa có
                }
            }

            reader.close();

            // In ra số lượng từ khác nhau
            System.out.println("Số lượng từ khác nhau trong file: " + wordList.size());
            System.out.println("Các từ khác nhau:");
            for (String word : wordList) {
                System.out.println(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
