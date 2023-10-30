package com.example.lections.lec_8.point_1;

public class HouseMain {

    public static void main(String[] args) {

        House house1 = new House("individual", 5, 100, true);
        House house2 = new House("individual", 5, 100, true);
        House house3 = new House("Tower", 5, 100, true);


        System.out.println(house1.equals(house2));
        System.out.println(house1.equals(house2));
        System.out.println(house1);
        System.out.println(house2);
    }
}
