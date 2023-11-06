package com.example.lections.lec_14.point_1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String url = "http://google-fhoto.com/145";
        PhotoService photoService = new PhotoService();
        //Так оставлять нельзя нужно обюработать или через try catch, или добавить ошибку в сигнатуру метода
        //byte[] photo = photoService.loadPhoto(url);

        //Пример checked exception
        byte[] bytes = new byte[0];
        try {
            bytes = photoService.loadPhoto(url);
        } catch (PingwitCheckedException e) {
            System.out.println(e.getMessage());
        }
        //пример unchecked exception
        byte[] editedPhoto = photoService.editPhoto(bytes);
        System.out.println(Arrays.toString(editedPhoto));
    }
}
