package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(source);
        int min = Integer.MAX_VALUE;

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read();
            min = Math.min(min, count);
        }
        System.out.println(min);
        fileInputStream.close();
    }
}
