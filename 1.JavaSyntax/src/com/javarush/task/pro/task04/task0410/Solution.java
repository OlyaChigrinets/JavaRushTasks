package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int secondMin = s.nextInt();
        int tmp = 0;
        if (min > secondMin) {
            tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (s.hasNextInt()) {
            int numb = s.nextInt();
            if (numb < min) {
                secondMin = min;
                min = numb;
            } else if (numb > min && numb < secondMin) {
                secondMin = numb;
            } else if (min == secondMin && numb > secondMin) {
                secondMin = numb;
            }

        }
        System.out.println(secondMin);
    }
}