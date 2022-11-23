package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path one = Path.of(str1);
        Path second = Path.of(str2);
        try {
            System.out.println(one.relativize(second));
        } catch (Exception ignored) {
        }

    }
}

