package com.example.lections.lec_16.point_5;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) {
        String inputPath = "src/main/java/com/example/lections/lec_16/StreamAndReader.txt";
        String outoputPath = "src/main/java/com/example/lections/lec_16/output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outoputPath))) {

            String line;
            while ((line =bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
