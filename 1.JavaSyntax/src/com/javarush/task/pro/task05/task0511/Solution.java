package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < multiArray.length; i++) {
            int numb = s.nextInt();
            multiArray [i] = new int[numb];
        }
    }
}
