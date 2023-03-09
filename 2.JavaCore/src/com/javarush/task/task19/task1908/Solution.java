package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String output = bufferedReader.readLine();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(input));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        List<String> list = new ArrayList<>();

        while (bufferedReader1.ready()) {
            list.add(bufferedReader1.readLine());
        }

        for (String line : list) {
            String[] splitLine = line.trim().split(" ");
            for (String split : splitLine) {
                int integer = 0;
                try {
                    integer = Integer.parseInt(split);
                    bufferedWriter.write(integer + " ");
                } catch (Exception ignore) {
                }

                
            }
        }


        bufferedReader.close();
        bufferedReader1.close();
        bufferedWriter.close();
    }
}
