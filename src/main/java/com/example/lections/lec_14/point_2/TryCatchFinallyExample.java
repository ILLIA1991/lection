package com.example.lections.lec_14.point_2;

import com.example.lections.lec_14.point_1.PhotoService;
import com.example.lections.lec_14.point_1.PingwitCheckedException;

import java.util.Arrays;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        PhotoService photoService = new PhotoService();
        String address = "http://google-fhoto.com/145";
        byte[] photo = new byte[0];
        try {
            photo = photoService.loadPhoto(address);
        } catch (PingwitCheckedException e) {
            System.out.println(e.getMessage());
        } finally { //Этот блок кода выполнится в любом случае, и обычно туда помещают какую - нибудь подчистку хвостов
             System.out.println("Finish");
        }
        System.out.println(Arrays.toString(photo));

    }
}
