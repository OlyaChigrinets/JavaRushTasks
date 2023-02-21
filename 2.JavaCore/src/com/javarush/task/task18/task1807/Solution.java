package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        FileInputStream fileInputStream =new FileInputStream(fileName);
        byte[] buffer = new byte[256];
        while (fileInputStream.available() > 0) {
            buffer[fileInputStream.read()]++;
        }
        System.out.println(buffer[44]);

        fileInputStream.close();
    }
}
