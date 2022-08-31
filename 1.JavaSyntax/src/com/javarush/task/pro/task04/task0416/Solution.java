package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coke = scanner.nextInt();
        int emp = scanner.nextInt();
        double r = (coke * 1.0 / emp);
        System.out.println(r);


    }
}