package com.example.lections.lec_10.point_2.application;

import com.example.lections.lec_10.point_2.Bankomat;
import com.example.lections.lec_10.point_2.EuroBankomat;

public class Application {

    public static void main(String[] args) {

        Bankomat bankomat = new EuroBankomat();

        // Так как у нас все методы протектед, то мы можем сделать все только через гет запрос. Потому что
        // Апликэйтион находится в отдельном пэкедже

        String message = bankomat.getCash(10);
        System.out.println(message);
    }
}
