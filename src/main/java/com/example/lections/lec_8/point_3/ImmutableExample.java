package com.example.lections.lec_8.point_3;

import java.util.Arrays;

public class ImmutableExample {

    public static void main(String[] args) {

        Car carFromInternet = new Car("Kia", "Ceed", EngineType.PETROL);
        System.out.println(carFromInternet);
        String brand = carFromInternet.getBrand();
        //ошибка програмиста
        carFromInternet.setBrand("Ford");

        System.out.println("Save to database" + carFromInternet);

        ImmutableCar kiaRio = new ImmutableCar("Kia", "Rio", EngineType.DIESEL, new int[] {1, 2, 3, 4, 5});

        int[] seats = kiaRio.getSeats();
        seats[1] = 777;
        System.out.println(kiaRio);
        System.out.println(Arrays.toString(seats));



        CarRecord carRecord = new CarRecord("Mercedes", "s500", EngineType.PETROL, new int[] {1, 2, 3, 4, 5});
        CarRecord carRecord1 = new CarRecord("Mercedes", "s500", EngineType.PETROL, new int[]{1, 2, 3, 4, 5});

        System.out.println("Equal record " + carRecord.equals(carRecord1));


    }
}
