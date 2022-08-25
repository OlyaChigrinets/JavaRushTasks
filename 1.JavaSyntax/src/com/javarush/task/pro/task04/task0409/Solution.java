package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (s.hasNextInt()) {
            int i = s.nextInt();
            min= min<i?min:i;
        }
        System.out.println(min);

    }
}