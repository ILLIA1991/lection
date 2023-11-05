package com.example.lections.lec_13.point_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //В блоке трай и кетч можно словить  ошибку любого уровня
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число: ");
            try {
                int input = scanner.nextInt();
                System.out.println(100/input);
            } catch (ArithmeticException exception) {  //Когда мы хотим обработать несколько ошибок, то мы можем делать сколько угодно catch
                System.out.println("У вас ошибочка: " + exception.getMessage());
            } catch (InputMismatchException exception) {
                String next = scanner.next();  //это нужно что бы очистить буфер сканера
                System.out.println("Вы неправильно вводите, нужно число, а не  " + next);
            } catch (Exception exception) {
                System.out.println(exception.getMessage()); //Иногда есть ошибки о которых мы не знаем и не можем предугадать.
                // Тогда в последнем catch мы бросаем Exception.
                // Если мы сделаем его вначале то от остальных кетчей не будет смысла,
                // так как они все наследуются от Exception
            }

        }
    }
}
