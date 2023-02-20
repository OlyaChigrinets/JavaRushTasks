package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] byteArray = new int[256];
        FileInputStream fileInputStream = new FileInputStream(s);

        while (fileInputStream.available() > 0) {
            byteArray[fileInputStream.read()]++;
        }
        int min = Integer.MAX_VALUE;

        for (int b : byteArray) {
            if (b < min && b > 0) min = b;
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == min) res.add(i);
        }
        for (Integer a : res) System.out.print(a + " ");

        fileInputStream.close();
    }
}
