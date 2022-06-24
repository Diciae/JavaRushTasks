package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        Scanner console = new Scanner(System.in);


        while (console.hasNextInt()){
            int y = console.nextInt();
            System.out.println(y);
            if (y>max)
                max=y;
        }
        if (max% 2==0) {
            System.out.println(max);
        }
        else
            System.out.println(Integer.MIN_VALUE);
    }
}