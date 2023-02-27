package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length != 0) {
            List<Integer> array = new ArrayList<>();
            try(FileInputStream fileInputStream = new FileInputStream(args[0])) {
                while (fileInputStream.available() > 0) {
                    array.add(fileInputStream.read());
                }
            }
            List<Integer> alf = new ArrayList<>();
            for (int i = 65; i < 91; i++) {
                alf.add(i);
            }
            for (int i = 97; i < 123; i++) {
                alf.add(i);
            }

            int count = 0;
            for (Integer i : array) {
                for (int j = 0; j < alf.size(); j++) {
                    if (i == alf.get(j)) count++;
                }
            }
            System.out.println(count);
        }
    }
}
