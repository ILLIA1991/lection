package com.example.lections.lec7.point1;

public class ConditionExample {

    public static void main(String[] args) {

        boolean isPasswordCorrect = checkPassword();
        boolean checkFaceId = checkFaceId();


        if(isPasswordCorrect && checkFaceId) {
            System.out.println("Dostup razreszen");
        } else {
            System.out.println("Ne otrabotal");
        }
    }
    public static boolean checkPassword() {
        System.out.println("Proveryem parol.........");
        return true;
    }
    public static boolean checkFaceId() {
        System.out.println("Proveraem vash face.....");
        return true;
    }


    // Есть еще логическое "или" - (||). Оно отработает если хотябы одно значение будет равно true

//    if(isPasswordCorrect || checkFaceId) {
//        System.out.println("Dostup razreszen");
}
