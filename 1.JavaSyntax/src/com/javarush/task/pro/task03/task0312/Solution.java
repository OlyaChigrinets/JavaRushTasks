package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s. nextLine();
        String b = s. nextLine();
        if (a.equals(b))
        System.out.println("строки одинаковые");
        else
        System.out.println("строки разные");
    }
}
