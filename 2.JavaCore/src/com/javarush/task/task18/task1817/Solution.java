package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int numb = 0;
        byte[] array = new byte[256];
        if (args.length != 0) {
            try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
                numb = fileInputStream.available();
                while (fileInputStream.available() > 0) {
                    array[fileInputStream.read()]++;
                }
            }
            int space = array[32];
            double result = (double) space / (double) numb * 100;

            System.out.printf("%.2f", result);
        }
    }
}
