package com.example.lections.lec_11.point_1;

public class OOPMain {

    public static void main(String[] args) {
        Human illia = new Human("Illia", "Belikov", 1991);
        Student student = new Student("Ivan", "Ivanov",1995, "BGU");
        Employee employee = new Employee("Igor", "Igorev", 1989, "My Access ID");

//        illia.breathe();
//        student.breathe();
//        employee.breathe();

        Animal[] animals = new Animal[] {illia,student,employee};

        for (Animal animal : animals ) {
            animal.breathe();
        }

        Human[] humans = new Human[] {illia, student, employee};

        for(Human human : humans) {
            human.walk();
            human.breathe();
        }





    }
}
