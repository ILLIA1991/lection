package com.example.lections.lec_14.point_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DataTimeExamole {

    //Обьекты могут создаваться через конструктору и чере вот такие статические методы(те что написаны курсивом)
    //Сиаимческий метод - это метод который мы можем вызвать не на обьекте а на классе
    public static void main(String[] args) {
        // Для работы со временем в Java есть классы LocalDate и LocalDateTime
        LocalDate now = LocalDate.now(); //Это метод выведет сегодняшнюю дату
        System.out.println(now);

        LocalDate.of(1991, 02, 03);
        LocalDate.of(1991, Month.FEBRUARY, 03);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        //При помощи этого класса и метода ofPattern (шаблон) мы можем установить формат даты,
        // месяц обязательно обозначается большими буквами
        String formattedMow = dateTimeFormatter.format(now);
        System.out.println(formattedMow);

        // парсить строку в дату -- это значит преобразовать  строку в джавовский обьект
        DateTimeFormatter forParser =  DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate fromString = LocalDate.parse("1991-02-03", forParser); //Помимо строки мы здесь еще можем передать формат

        System.out.println(dateTimeFormatter.format(fromString));

        //точное время и дата
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy : HH-mm-ss-ms");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter1.format(dateTime));

        // точное время
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

    }
}
