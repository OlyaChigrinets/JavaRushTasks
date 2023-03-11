package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path1 = bufferedReader.readLine();
        String path2 = bufferedReader.readLine();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
        List<String> list = new ArrayList<>();

        while(bufferedReader1.ready()) {
            list.add(bufferedReader1.readLine());
        }
        StringBuilder stringBuilder = new StringBuilder();

        for(String s : list) {
            char [] array = s.toCharArray();
            for (char a : array) {
                if(Character.isLetterOrDigit(a) || a == ' ') {
                    stringBuilder.append(a);
                }
            }
        }

        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedReader.close();
        bufferedReader1.close();
        bufferedWriter.close();
    }
}
