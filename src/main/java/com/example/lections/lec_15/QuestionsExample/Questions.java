package com.example.lections.lec_15.QuestionsExample;

import java.util.Arrays;

public class Questions {
    //Обьектно ориентированное программирование(ООП) - взаимодействие всех обьектов между собой
    public static void main(String[] args) {

        String[] strings = new String[] {"ddd", "aaa", "sss"};

//        String string = strings[1];
//
//        String pupa = "pupa";
//
//        strings[2] = pupa;
//        strings[0] = null;
//
//        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


    }
}
