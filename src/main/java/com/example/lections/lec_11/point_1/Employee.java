package com.example.lections.lec_11.point_1;

public class Employee extends Human {

    private final String accessId;

    public Employee(String name, String surname, int yearOfBirth, String accessId) {
        super(name, surname, yearOfBirth);
        this.accessId = accessId;
    }

    public String getAccessId() {
        return accessId;
    }
}
