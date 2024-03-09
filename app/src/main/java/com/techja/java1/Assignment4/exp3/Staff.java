package com.techja.java1.Assignment4.exp3;

import android.annotation.SuppressLint;

import java.util.Random;

public class Staff {
    private String id;
    private String name;
    private String sex;
    private String dateOfBird;
    private String phone;
    private String lever;

    public Staff(String name, String sex, String dateOfBird, String phone, String lever) {
        this.id = randomId();//mỗi lần khởi tạo staff sẽ tự tạo ra 1 id ngẫu nhiên
        this.name = name;
        this.sex = sex;
        this.dateOfBird = dateOfBird;
        this.phone = phone;
        this.lever = lever;
    }

    @SuppressLint("DefaultLocale")
    private String randomId() {
        Random random=new Random();
        int randomNumber=random.nextInt(200);
        return "NV" + String.format("%05d",randomNumber);//tạo ra randomNumber vơi 5 chữ số bắt đầu bằng NV....
    }

    public String getSex() {
        return sex;
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public String getPhone() {
        return phone;
    }

    public String getLever() {
        return lever;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDateOfBird(String dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }
}

