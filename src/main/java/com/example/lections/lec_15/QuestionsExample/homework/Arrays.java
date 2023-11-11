package com.example.lections.lec_15.QuestionsExample.homework;
/*Сделаем массив из целых чисел: {4, 1, -10, 15, 25, 88, 90, 133, 20, 0}
В цикле: распечатываем i-й элемент массива через
System.out.printlf - пример: Элемент 0 массива: 4,
распечатываем результат деления элемента на 2. Пример: Результат деления 0 на 2: 0
Вычисляем сумму всех элементов.
 */
public class Arrays {

    public static void main(String[] args) {
         int[] ints = new int[] {4, 1, -10, 15, 25, 88, 90, 133, 20, 0};

        for (int i = 0; i < ints.length; i++) {
            int myInt = ints[i]; //Достаем i-й элемент из массива

            int sum = 0;
            sum += myInt;
            System.out.printf(" Элемент %d массива: %d", i, myInt);
            System.out.println();

            int result = myInt/2;
            System.out.printf("Результат деления %d на 2: %d", myInt, result);
            System.out.println();
            System.out.println("sum:" + sum);

        }
    }
}
