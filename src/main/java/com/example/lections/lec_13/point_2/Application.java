package com.example.lections.lec_13.point_2;

public class Application {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();

        String report = reportGenerator.generateReport("Illia");
        System.out.println(report);
    }
}
