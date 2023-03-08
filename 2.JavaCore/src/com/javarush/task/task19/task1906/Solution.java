package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String output = bufferedReader.readLine();

        FileReader fileReader = new FileReader(input);
        FileWriter fileWriter = new FileWriter(output);


        List<Integer> list = new ArrayList<>();
        while (fileReader.ready()) {
            int count = fileReader.read();
            list.add(count);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 1) {
                fileWriter.write(list.get(i));
            }
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
