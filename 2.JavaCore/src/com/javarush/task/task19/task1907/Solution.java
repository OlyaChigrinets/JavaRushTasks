package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        FileReader fileReader = new FileReader(input);

        BufferedReader bufferedReader1 = new BufferedReader(fileReader);
        String line = bufferedReader1.readLine();
        int count = 0;

        while (line != null) {
            if (line.contains("world")) count++;
            line = bufferedReader1.readLine();
        }
        System.out.println(count);

        bufferedReader.close();
        bufferedReader1.close();
        fileReader.close();
    }
}
