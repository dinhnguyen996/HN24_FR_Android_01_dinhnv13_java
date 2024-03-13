package com.techja.java1.finaltest.exp4;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {
    private ArrayList<Contact> contacts;


    public ContactManagement() {
        contacts = new ArrayList<>();
    }

    // Phương thức kiểm tra số điện thoại đã tồn tại trong danh bạ hay chưa
    public boolean checkNumberExist(String phoneNumber) {

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(contact.getPhoneNumber()+" đã tồn tại");
                return true;
            }
        }
        System.out.println("số cần thìm chưa tồn tại");
        return false;
    }


    // Phương thức thêm contact
    public void addContact(String name, String phoneNumber) {
        if (!checkNumberExist(phoneNumber)) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
            System.out.println("Đã thêm contact thành công.");
        } else {
            System.out.println("Số điện thoại đã tồn tại trong danh bạ.");
        }
    }

    // Phương thức chỉnh sửa contact
    public void editContact(String oldPhoneNumber, String newPhoneNumber) {
        boolean oldExist = checkNumberExist(oldPhoneNumber);
        boolean newExist = checkNumberExist(newPhoneNumber);

        if (oldExist && !newExist) {
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(oldPhoneNumber)) {
                    contact.setPhoneNumber(newPhoneNumber);
                    System.out.println("Đã chỉnh sửa contact thành công.");
                    return;
                }
            }
        } else {
            System.out.println("Số điện thoại cũ không tồn tại hoặc số điện thoại mới đã tồn tại trong danh bạ.");
        }
    }

    // Tìm kiếm  dựa vào dữ liệu nhập vào
    public void searchContact(String searchData) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(searchData) || contact.getPhoneNumber().equals(searchData)) {
                System.out.println("Tên: " + contact.getName() + ", Số điện thoại: " + contact.getPhoneNumber());
            }
        }
    }

    // Phương thức sắp xếp danh bạ theo bảng chữ cái
    public void sortContacts() {
        contacts.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        System.out.println("Đã sắp xếp danh bạ tặng dần theo bảng chữ cái");
    }

    public void displayContact(ContactManagement contactManagement) {
        for (Contact contact: contacts){
            System.out.println("Tên: "+contact.getName() + " - " + "Phone:" + contact.getPhoneNumber());
        }
    }


    public void checkPhoneNumber(ContactManagement contactManagement, Scanner scanner) {
        System.out.println("Nhập số điện thoại cần check");
        String checkNumber= scanner.nextLine();
        contactManagement.checkNumberExist(checkNumber);
    }
}
