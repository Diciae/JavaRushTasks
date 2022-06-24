package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int x= 0; x<10; x++){
            for (int y = 0; y<9; y++){
                if (x==0&&y==3) System.out.print(robot);
                if (x==0&&y==5)continue;
                if (x==9&&y==8)continue;
                System.out.print(land);
            }
            if (x==9) System.out.print(bug);
            System.out.println("1");
        }
    }
}
