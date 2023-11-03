package com.example.lections.lec_10.point_1;

public class Application {
    public static void main(String[] args) {

        Calculator myCalculator = new FunnyCalculator();

        int sum = myCalculator.add(5, 6);

        System.out.println(sum);

        FunnyCalculator myFunnyCalc = new FunnyCalculator();

        int divided = myFunnyCalc.divide( 12, 6);
        int multiplication = myFunnyCalc.multiply(6, 9);

        System.out.println(divided + multiplication);

        Calculator myCalculator2 = new SadCalculator();

        int sum2 = myCalculator2.add(5,8);

        System.out.println(sum2);

        Lightable light = new FunnyCalculator();
        light.turnLightOn();

        SuperFunnyCalculator superFunnyCalculator = new SuperFunnyCalculator();

    }
}
