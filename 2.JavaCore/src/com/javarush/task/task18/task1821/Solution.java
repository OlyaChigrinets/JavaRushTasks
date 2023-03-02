package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = new int[128];
        FileReader fileReader = new FileReader(args[0]);
        while(fileReader.ready()) {
            array[fileReader.read()]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) System.out.println((char) i + " " + array[i]);
        }

        fileReader.close();

    }
}
