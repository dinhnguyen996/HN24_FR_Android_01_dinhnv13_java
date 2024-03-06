package com.techja.java1.Assignment2.exp1;

import java.util.ArrayList;

public abstract class  Staff {
    protected String name;
    protected String date;
    protected double wage;//lương

    public Staff(String name, String date) {
        this.name = name;
        this.date = date;
    }
    //phương thích tính tiền lương
    public abstract void payRool();
    //in ra tên nhân viên
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", wage=" + wage +
                '}';
    }
}

