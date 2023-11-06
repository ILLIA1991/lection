package com.example.lections.lec_14.point_1;

public class PingwitCheckedException extends Exception {
    //Чтобы создать свой Exception мы обязательно должны унаследоваться от класса Exception
    public PingwitCheckedException(String message) {
        super(message); //super - ознчает , что мы вызываем метод у класса родителя
    }
    //Если мы хотим чтобы в нашем класс метод вел себя как-то иначе, то мы прописываем Override

}
