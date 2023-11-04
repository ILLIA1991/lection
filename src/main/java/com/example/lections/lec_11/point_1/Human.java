package com.example.lections.lec_11.point_1;

public class Human implements Singable, Walkable {

    //Инкапсуляция в этом классе это то, что мы сделали все неши поля приватными
    // и изменять можем только с помощью методов внутри этого класса
    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    @Override
    public void breathe() {
        System.out.println("Вдох-выдох");

    }
    private void openMouth() {
        System.out.println("open");

    }

    @Override
    public void walk() {
        System.out.println("Бегу в припрыжку");
    }

    @Override
    public void sing() {
        System.out.println("Орууу");
    }
}
