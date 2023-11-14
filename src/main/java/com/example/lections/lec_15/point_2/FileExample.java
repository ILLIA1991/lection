package com.example.lections.lec_15.point_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

    //java IO input Output
    public static void main(String[] args) throws IOException {

        String path = "src/main/java/com/example/lections/lec_15/point_2/bla.txt";
       // String path1 = "src/main/java/com/example/lections/lec_15/point_2/emptypackage";
        // Не использум String absolutPath = "C:\\Users\\hp ProBook\\IdeaProjects\\lections\\src\\main\\java\\com\\example\\lections\\lec_15\\point_2\\bla.txt";
//        File file = new File(path);
        File file = new File(path);

       // System.out.println(file.exists()); //Проверяе существует ли наш файл
        //System.out.println(file.isDirectory());//Проверяем находится ли он в нашей директории
        //System.out.println(file.getAbsolutePath());//Выведет длинный путь
        // boolean delete = file.delete();
        // file.mkdir(); создает директорию
        // file.crateNewFile(); создаем новый файл

        Scanner scanner = null;
        try {
            // Выведем в консоль то что написано в файле
            scanner = new Scanner(file);
            //Чтобы выводились все строчки нужно написать цикл, через метод hasNextLine
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            if(scanner != null) {
                scanner.close();
            }
            System.out.println(exception.getMessage());
        }









    }
}
