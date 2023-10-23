package com.example.lections.lec7.point1;

public class SingleDoubleConditionExample {

    public static void main(String[] args) {
//Проверка в ифе, происходит последовательно, если checkPassword вернет false , то логическому и у же нет
        //смысла дальше проверять checkFaceId
        // Также есть одинарное & которое позволяет отработатбь и первому и второму методу
        // в независимости от значений true или false
        if(checkPassword() & checkFaceId()) {
            System.out.println("My rady wam!!");
        }
    }
    public static boolean checkPassword() {
        System.out.println("Proveryem parol.........");
        return false;
    }
    public static boolean checkFaceId() {
        System.out.println("Proveraem vash face.....");
        return true;
    }
}
