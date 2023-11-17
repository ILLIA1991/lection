package com.example.lections.lec_16.point_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        String path = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";
        File file = new File(path);
        //InputStream - это абстрактный клас (От абстрактного класса мы не можем создать обьект)
        try (InputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
