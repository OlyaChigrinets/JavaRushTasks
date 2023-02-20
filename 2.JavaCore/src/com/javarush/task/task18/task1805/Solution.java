package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(source);
        int[] arrayByte = new int[256];

        while (fileInputStream.available() > 0) {
            arrayByte[fileInputStream.read()]++;
        }
        fileInputStream.close();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrayByte.length; i++) {
            if (arrayByte[i] > 0) result.add(i);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
