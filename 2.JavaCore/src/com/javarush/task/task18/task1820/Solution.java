package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        PrintWriter printWriter = new PrintWriter(new FileWriter(path2));

        while (bufferedReader.ready()) {
            String [] array = bufferedReader.readLine().split(" ");
            for (String s : array) {
                double d = Double.parseDouble(s);
                long l = Math.round(d);
                printWriter.print(l + " ");
            }
        }

        bufferedReader.close();
        printWriter.close();
    }
}
