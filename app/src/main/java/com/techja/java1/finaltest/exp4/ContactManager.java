package com.techja.java1.finaltest.exp4;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManagement contactManagement = new ContactManagement();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Thêm contact");
            System.out.println("2. Chỉnh sửa contact");
            System.out.println("3. Tìm kiếm contact");
            System.out.println("4. Sắp xếp danh bạ");
            System.out.println("5. Hiển thị danh bạ");
            System.out.println("6. Kiểm tra số điện thoại đã có trong contact hay chưa");
            System.out.println("7. Thoát");
            System.out.print("Chọn một hành động: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addContact(contactManagement, scanner);//thêm contact
                    break;
                case 2:
                    editContact(contactManagement, scanner);//sửa contact
                    break;
                case 3:
                    searchContact(contactManagement, scanner);//tìm contact
                    break;
                case 4:
                    contactManagement.sortContacts();//sắp xếp contact
                    break;
                case 5:
                    contactManagement.displayContact(contactManagement);//hiển thị contact
                    break;
                case 6:
                    contactManagement.checkPhoneNumber(contactManagement,scanner);//kiểm tra number trong contact
                    break;
                case 7:
                    isRunning = false;
                    System.out.println("Ứng dụng đã kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }



    public static void addContact(ContactManagement contactManagement, Scanner scanner) {
        System.out.print("Nhập tên contact: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        contactManagement.addContact(name, phoneNumber);
    }

    public static void editContact(ContactManagement contactManagement, Scanner scanner) {
        System.out.print("Nhập số điện thoại cũ: ");
        String oldPhoneNumber = scanner.nextLine();
        System.out.print("Nhập số điện thoại mới: ");
        String newPhoneNumber = scanner.nextLine();
        contactManagement.editContact(oldPhoneNumber, newPhoneNumber);
    }

    public static void searchContact(ContactManagement contactManagement, Scanner scanner) {
        System.out.print("Nhập tên hoặc số điện thoại cần tìm kiếm: ");
        String searchData = scanner.nextLine();
        contactManagement.searchContact(searchData);
    }}

