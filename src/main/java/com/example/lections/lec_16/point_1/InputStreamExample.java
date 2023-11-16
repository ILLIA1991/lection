package com.example.lections.lec_16.point_1;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        String path = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";
        File file = new File(path);
        //InputStream - это абстрактный клас (От абстрактного класса мы не можем создать обьект)
        InputStream inputStream = null;


        try {
            inputStream = new FileInputStream(file);

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char)data);//Мы можем инт привести к типу чар - приведение типов
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // NullPointerException
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
