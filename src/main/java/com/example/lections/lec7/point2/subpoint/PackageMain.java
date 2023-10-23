package com.example.lections.lec7.point2.subpoint;

public class PackageMain {

    public static void main(String[] args) {

        Person person = new Person();
        //Внутри нашего package нам доступны поля protected, а за его пределами нет
        int numberPassport = person.numberPassport;
        //person.motherSurname
        person.sayHello();
    }
}
