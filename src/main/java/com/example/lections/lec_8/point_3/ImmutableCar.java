package com.example.lections.lec_8.point_3;

import java.util.Arrays;
import java.util.Objects;

public final class ImmutableCar {

    private final String brand;
    private final String model;
    private final EngineType engineType;
    private final int[] seats;

    public ImmutableCar(String brand, String model, EngineType engineType, int[] seats) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int[] getSeats() {
        return seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableCar that = (ImmutableCar) o;
        return Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && engineType == that.engineType && Arrays.equals(seats, that.seats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, model, engineType);
        result = 31 * result + Arrays.hashCode(seats);
        return result;
    }

    @Override
    public String toString() {
        return "ImmutableCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", seats=" + Arrays.toString(seats) +
                '}';
    }
}
