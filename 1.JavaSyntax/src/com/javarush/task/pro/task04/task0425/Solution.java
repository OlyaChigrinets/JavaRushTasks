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
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                if (a == 9) {
                    System.out.print(death);
                } else if (a < 9 && b == 3) {
                    System.out.print(hole);
                } else
                    System.out.print(land);
            }
            System.out.println();
        }
    }
}
