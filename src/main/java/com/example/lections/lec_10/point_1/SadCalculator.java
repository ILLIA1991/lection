package com.example.lections.lec_10.point_1;

public class SadCalculator implements Calculator{

    @Override
    public int add(int a, int b) {
        System.out.println("Печалька!");
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("Печалька!");
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        System.out.println("Печалька!");
        return a/b;
    }
}
