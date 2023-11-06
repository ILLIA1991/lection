package com.example.lections.lec_13.point_2;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class ReportGenerator {
    public String generateReport(String employee) {
        System.out.println("Connecting to the database..........");
        String result = "";
        try {
           connectToDB();
           result = String.format("%s, your salary 60000$", employee);
            System.out.println("Success!!!");
        } catch (IOException e) {
            System.out.println("I have problems connecting to Data Base!!!");
        }
        return result;
    }

    private void connectToDB() throws IOException {
        if(RandomUtils.nextBoolean()) {
            throw new IOException("Error connecting to DB");
        }
    }
}
