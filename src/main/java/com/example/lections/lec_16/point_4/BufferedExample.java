package com.example.lections.lec_16.point_4;

import java.io.*;
import java.util.Arrays;

public class BufferedExample {
    public static void main(String[] args) {

        String inputPath = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";

        try(InputStream inputStream = new FileInputStream(inputPath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            byte[] bytes = new byte[300];
            int n;
            while ((n = bufferedInputStream.read(bytes)) != -1) {
                for (byte aByte : bytes) {
                    System.out.print((char) aByte);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
