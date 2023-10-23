package com.example.lections.lec7.point2.subpoint;

public class Person {

    //private->default(bez modifikatora)->protected-.public

    public String name;
    String email;
    protected int numberPassport = 15251;
    private String motherSurname;

    public void sayHello() {
        System.out.println("hello!");
    }
}
