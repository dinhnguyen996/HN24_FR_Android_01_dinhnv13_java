package com.techja.java1.Assignment2.exp1;

public class ProductionStaff extends Staff{
    private int product;
    public ProductionStaff(String name, String date, int product) {
        super(name, date);
        this.product = product;
    }

    @Override
    public void payRool() {
        wage=product * 5000;
    }
}
