package com.example.lections.lec_11.point_2;

import com.example.lections.lec_11.point_1.Human;
import org.apache.commons.lang3.StringUtils;


public class StringExample {

    public static void main(String[] args) {

        Human human = new Human("Egor", "Egorka", 1999);

        //Создание строк
        String hello = "Hello";
        String hello1 = "Hello";
        //pull - строк   создан чтобы экономить память,
        // hello и hello1 ccылаются на одну и ту же ссылку в памяти
        // Строки сравниваются только через equals
        System.out.println(hello.equals(hello1));
        System.out.println(hello == hello1);

        //Обьекты в классе String по сути неизменяемые
        String hello2 = "Hello";
        String helloWorld = hello2;
        helloWorld = helloWorld + "World!";
        System.out.println(helloWorld);

        char[] chars = new char[] {'m', 'a', 'm', 'a'};
        String fromChars = String.valueOf(chars);
        System.out.println(fromChars);

        //У класса String есть очень пполезный метод format.
        //Его суть в том, что наши обьекты можно передовать с помощью аргумента
        String s = "Добрый вечер, " + human.getName() + "! Мы Вам рады!";
        String format = String.format("Добрый вечер, %s %s. Мы вам рады!", human.getName(), human.getSurname());
        System.out.println(format);

        //Метод join - это обьединение нескольких строк в одну
        String join = String.join("<->", "Vika", "Olga", "Sveta", human.getName());
        System.out.println(join);

        // Бывает такое , что в программе нужно сравнить строки и не брать в рассчет регистр
        String emailUpper = "Belikov1@gmail.com";
        String emailLower = "belikov1@gmail.com";

        //Есть метод equalsIgnorCase
        System.out.println(emailUpper.equalsIgnoreCase(emailLower));

        //Если мы хотим преобразовать к маленькому регистру, то используем метод toLowerCase(),
        // если к большому регистру то to UpperCase()

        String s1 = "ACDC".toLowerCase();
        String s2 = "acdc".toUpperCase();
        System.out.println(s1);
        System.out.println(s2);


        //Метод strip уберет пробелы в начале и в конце строки
        String privateWhiteSpace = "   privet   ";
        String strip = privateWhiteSpace.strip();
        System.out.println(strip);

        //Метод  isEmpty(), который отвечает нам boolean, пустая ли строка
        boolean empty = privateWhiteSpace.isEmpty();
        System.out.println(empty);
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        //Метод isBlank() вернет true если строка или пустая, или не имеет символов
        String blankString = "  ";
        boolean blank = blankString.isBlank();
        System.out.println(blank);

        //Можем разбить строку на массив символов
        char[] chars1 = strip.toCharArray();
        char[] reversed = new char[chars1.length];

        //Метод который вернет символ по индексу - charAt()
        String example = "example";
        char c = example.charAt(3);
        System.out.println(c);

        //С помощью метода replace мы можем один символ заменить на какой-нибудь другой
        String replace = example.replace("e", "E");
        System.out.println(replace);

        //Есть класс StringBuilder, и он используется когда нам нужно модифицировать строку много раз
        StringBuilder stringBuilder = new StringBuilder(0);
        //String s12 = "0";
        //Создадим сто лишних строк
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("mam");  //append - значит прибавить
            System.out.println(stringBuilder);

            //Текстовые блоки
            String textBlock = """
                    Hello world!
                    My name is Illia.
                    I'm Java Programmer
                    """;
            System.out.println(textBlock);

            //Есть библиотека Apache Commons Maven для работы со строками
            boolean notBlank = StringUtils.isNotBlank("");
            String reverse = StringUtils.reverse("palindrom");
            System.out.println(reverse);
            System.out.println(notBlank);
        }


    }
}
