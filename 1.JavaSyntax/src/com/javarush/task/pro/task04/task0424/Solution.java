package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int x;
        do {
            x = bombInterface.nextInt();
            System.out.println(x);
        }
            while (x % 10 != 0);
//            System.out.println(x);
        }
    }
