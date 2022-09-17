package com.javarush.task.pro.task07.task0716;

/* 
Запуск систем корабля
*/

import java.util.Scanner;

public class Solution {
    public static char[] chars = {1076, 1086, 1088, 1084, 1080, 1053};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
