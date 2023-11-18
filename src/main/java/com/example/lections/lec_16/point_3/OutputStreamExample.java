package com.example.lections.lec_16.point_3;

import java.io.*;

public class OutputStreamExample {

    public static void main(String[] args)  {
        String path = "src/main/java/com/example/lections/lec_16/output.txt";
        File file = new File(path);
//В tryможно передать вторым аргументом boolean флаг (append) - это значит дополнить.
// Если мы передадим туда true , то оно просто дополнит еще одной такой надписью
        try (OutputStream outputStream = new FileOutputStream(file)) {
           outputStream.write("Hello from Pingwit".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
