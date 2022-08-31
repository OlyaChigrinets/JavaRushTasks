package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double pi = 3.14;
        int c = (int) Math.floor(pi * r * r);
        System.out.println(c);


    }
}