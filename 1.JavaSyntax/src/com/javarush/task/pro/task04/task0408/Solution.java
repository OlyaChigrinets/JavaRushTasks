package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i<20){
            i++;
            if (i%7==0)
                continue;
            System.out.println(i);
        }
    }
}