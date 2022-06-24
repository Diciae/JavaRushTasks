package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int m = (number*(number+1))/2;

        while (number>=0) {
            System.out.println(m);
            break;}

            if (number<=0){
                System.out.println(sum);
            }

            }
        }

//        //напишите тут ваш код
//        System.out.println(sum);

