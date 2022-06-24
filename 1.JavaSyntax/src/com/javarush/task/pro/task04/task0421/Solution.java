package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int x = 0;
        int sum=0;
        while (x<100){
            x++;
          if (x%2==0){
              sum = sum+x;
          };
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}