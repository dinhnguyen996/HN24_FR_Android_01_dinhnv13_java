package com.techja.java1.Assignment2.exp1;

public class OfficeStaff extends Staff{
    private int workDay;
    public OfficeStaff(String name, String date, int workDay) {
        super(name, date);
        this.workDay = workDay;
    }
    @Override
    public void payRool() {
        wage=workDay * 100000;
    }
}
