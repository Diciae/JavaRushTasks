package com.javarush.task.pro.task04.task0410;

public class TestClass {
    public static void main(String[] args) {
        if (5 > 0){
            System.out.println("5");
            int number = 5 * 8;
            System.out.println(number * 2 + "yyy".length());
        } else {
            System.out.println("0");
        }
        System.out.println(5 > 0 ? "5" : "0");
    }
}
