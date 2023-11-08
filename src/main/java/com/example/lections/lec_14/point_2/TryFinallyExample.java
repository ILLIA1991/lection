package com.example.lections.lec_14.point_2;

import com.example.lections.lec_14.point_1.PhotoService;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

public class TryFinallyExample {

    // final - для классов, методов и полей
    // finally - для блоков try
    public static void main(String[] args) {
        PhotoService photoService = new PhotoService();
        byte[] photo = RandomUtils.nextBytes(50);
        byte[] editedPhoto = new byte[0];

        try {
            editedPhoto = photoService.editPhoto(photo);
        } finally {
            System.out.println("Finish");
        }
        System.out.println(Arrays.toString(editedPhoto));
    }
}
