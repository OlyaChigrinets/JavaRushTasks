package com.javarush.task.pro.task15.task1506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)
        ) {
            List<String> files = Files.readAllLines(Path.of(scanner.nextLine()));
            for (String s : files) {
                char[] buffer = s.toCharArray();
                for (char b : buffer) {
                    if (b != '.' && b != ',' && b != ' ') {
                        System.out.print(b);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

