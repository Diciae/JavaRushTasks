package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String text = " любит меня.";
        int x = 0;
        while (x<10) {
            System.out.println(name + text);
            x++;
        }

        //напишите тут ваш код

    }
}
