package com.example.lections.lec_16.point_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        String path = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";
        File file = new File(path);
        //InputStream - это абстрактный клас (От абстрактного класса мы не можем создать обьект)
        // Есть такой интерфейс AutoCloseable, и мы в tryWithResources можем поместить любые ресурсы
        try (InputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (InputStream inputStream = new FileInputStream(file)) {
//            int data;
//            byte[] bytes = new byte[16];
//            while ((data = inputStream.read(bytes, 10, 16)) != -1) {
//                System.out.print(Arrays.toString(bytes));
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
