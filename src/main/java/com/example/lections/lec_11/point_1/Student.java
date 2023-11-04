package com.example.lections.lec_11.point_1;

public class Student extends Human {

    private String university;

    public Student(String name, String surname, int yearOfBirth, String university) {
        super(name, surname, yearOfBirth);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void breathe() {
        System.out.println("Студент дышет через раз");
        super.breathe();
    }
}
