package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = bufferedReader.readLine();
        String path2 = bufferedReader.readLine();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));

        while (bufferedReader1.ready()) {
            String line = bufferedReader1.readLine();
            String newLine = line.replace(".", "!");
            bufferedWriter.write(newLine);
        }

        bufferedReader.close();
        bufferedReader1.close();
        bufferedWriter.close();


    }
}
