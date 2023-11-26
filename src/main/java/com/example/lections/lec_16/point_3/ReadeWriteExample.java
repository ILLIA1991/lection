package com.example.lections.lec_16.point_3;

import java.io.*;

public class ReadeWriteExample {
    public static void main(String[] args) {
        String outoputPath = "src/main/java/com/example/lections/lec_16/output.txt";
        String inputPath = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";

        // ZipOutputStream - нужен для записи файлов в зип-архив

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outoputPath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outoputPath, true)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
