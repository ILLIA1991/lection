package com.example.lections.lec_10.point_2;

public abstract class Bankomat {

    //Абстрактный класс, это класс обьект которого не можно создать

    public String getCash(int amount) {
        String currencyName = getCurrencyName();
        String message = "Возьмите ваши " + amount + currencyName;

        return message;
    }

    protected abstract String getCurrencyName();
}
