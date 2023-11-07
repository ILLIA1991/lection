package com.example.lections.lec_14.point_1;

public class PingwitUncheckedException extends RuntimeException {
    //Если мы не ловим ошибку , то наследуемся от класса RuntimeException

    public PingwitUncheckedException(String message) {
        super(message);
    }
}
