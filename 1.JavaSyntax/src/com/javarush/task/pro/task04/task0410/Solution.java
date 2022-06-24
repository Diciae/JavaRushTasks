package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int min2 = console.nextInt();
        if (min2 < min){
            int tmp = min2;
            min2 = min;
            min = tmp;
        }
//-5 2 4 8
        while (console.hasNextInt()){ // min = 4, min2 = 4
            int number = console.nextInt();// number1 = -5, number 2 = 2
            if (min == min2 && number > min){
                min2 = number;
            } else if (number < min) { //-5, 4, 8, 2
                min2 = min;
                min = number;
            } else if (number > min && number < min2){
                min2 = number;
            }
        }
        System.out.println(min2); //min 2 = 4

    }
}