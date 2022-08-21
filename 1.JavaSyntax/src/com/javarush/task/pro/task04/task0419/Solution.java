package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //5
        int sum = 0;
        int i = 0; // счетчик
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}