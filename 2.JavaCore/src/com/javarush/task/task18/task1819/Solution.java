package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();
        List<Integer> array = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(path2)) {
            while (fileInputStream.available() > 0) {
                array.add(fileInputStream.read());
            }
        }

        try (FileInputStream fileInputStream = new FileInputStream(path1)) {
            while (fileInputStream.available() > 0) {
                array.add(fileInputStream.read());
            }
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(path1)) {
            for (Integer integer : array) fileOutputStream.write(integer);

        }
    }
}
