package com.example.lections.lec_14.point_3;

import com.example.lections.lec_14.point_1.PingwitCheckedException;

public class Application {

    public static void main(String[] args) {
        PhotoServiceInterface serviceInterface = new PingwitPhotoService();

        try {
            serviceInterface.loadPhoto("address");
        } catch (PingwitCheckedException e) {
            e.printStackTrace();
        }

        PingwitPhotoService photoService = new PingwitPhotoService();
        photoService.loadPhoto("address");
    }
}
