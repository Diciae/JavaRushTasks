package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник " +
            "существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не " +
            "существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a < (b+c) && (b < ( c + a )) && ( c < ( a + b ) ) ) {
            System.out.println(TRIANGLE_EXISTS);}
            else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
//
//        if (a >= (b + c ))
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }
//        if (b < (c + a)) {
//            System.out.println(TRIANGLE_EXISTS);
//        }
//        else if ( b > (c + a )){
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }
//        if (c < (a + b)) {
//            System.out.println(TRIANGLE_EXISTS);
//        }
//        else if (c > (a + b)) {
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }

    }
}
