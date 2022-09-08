package com.javarush.task.pro.task05.task0527;

/* 
Подготовка Кибердракона
*/

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        array[0] = new int[1];
        array[1] = new int[2+1];
        array[2] = new int[2*2+1];
        array[3] = new int[2*3+1];
        array[4] = new int[2*4+1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
