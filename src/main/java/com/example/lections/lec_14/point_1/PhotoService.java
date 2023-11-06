package com.example.lections.lec_14.point_1;

import org.apache.commons.lang3.RandomUtils;

public class PhotoService {

    public byte[] loadPhoto(String address) throws PingwitCheckedException { //Обязательно нужно добавить ошибку в сигнатуру метода, когда мы ее хотим обработать
        if(RandomUtils.nextBoolean()) {
            throw new PingwitCheckedException("Error connecting to server...");
        }
        return  RandomUtils.nextBytes(50);
    }

    public byte[] editPhoto(byte[] photo) {
        if (RandomUtils.nextBoolean()) {
            throw new PingwitUncheckedException("Error during photo processing....");
        }
        System.out.println("Photo is ready!");
        return RandomUtils.nextBytes(photo.length);
    }
}
