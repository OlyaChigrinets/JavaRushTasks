package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(source);
        int max = 0;

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read();
            max = Math.max(max, count);
        }
        System.out.println(max);
        fileInputStream.close();
    }
}
