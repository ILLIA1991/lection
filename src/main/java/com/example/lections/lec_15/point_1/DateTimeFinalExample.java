package com.example.lections.lec_15.point_1;

import java.time.LocalDate;

public class DateTimeFinalExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 12,15);

        //Если мы хотим добавить дни и вывести дату после суммы , то используем метод plusDays
        LocalDate date1 = date.plusDays(100);
        System.out.println(date1);

        //Также даты можно сравнивать между собой
        //Выведет true если data1 стоит в календаре после data, иначе false
        boolean after = date.isAfter(date1);
        System.out.println(after);


    }
}
