package com.example.lections.lec_16.point_1;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        String path = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";
        File file = new File(path);
        //InputStream - это абстрактный клас (От абстрактного класса мы не можем создать обьект)


        try {
            InputStream inputStream = new FileInputStream(file);

            int data = inputStream.read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
