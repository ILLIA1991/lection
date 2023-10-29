package com.example.lections.lec_8.point_3;

public class ImmutableExample {

    public static void main(String[] args) {

        Car carFromInternet = new Car("Kia", "Ceed", EngineType.PETROL);
        System.out.println(carFromInternet);
        String brand = carFromInternet.getBrand();

        carFromInternet.setBrand("Ford");

        System.out.println("Save to database" + carFromInternet);

        ImmutableCar kiaRio = new ImmutableCar("Kia", "Rio", EngineType.DIESEL, new int[] {1, 2, 3, 4, 5});
    }
}
