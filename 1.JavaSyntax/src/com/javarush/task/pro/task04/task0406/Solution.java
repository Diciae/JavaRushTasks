package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        while (true) {
            String w = console.nextLine();

            if (w.equals("enough")) {
                break;
            } else System.out.println(w);
        }
    }
}