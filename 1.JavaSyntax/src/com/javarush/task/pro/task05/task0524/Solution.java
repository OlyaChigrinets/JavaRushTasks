package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

import java.util.Arrays;

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int [200];
        int j = 0;
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                coordinates[i] = j;

            } else {
                coordinates [i] = j +1;
                j= j+10;
            }
        }
        System.out.println(Arrays.toString(coordinates));
    }
}