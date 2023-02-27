package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        List<Integer> buffer = new ArrayList<>();
        List<Integer> buffer2 = new ArrayList<>();

        try(FileReader fileReader1 = new FileReader(s2))
        {
            while(fileReader1.ready()) {
                buffer.add(fileReader1.read());
            }
        }
        try(FileReader fileReader2 = new FileReader(s3))
        {
            while(fileReader2.ready()) {
                buffer2.add(fileReader2.read());
            }
        }

        try(FileWriter fileWriter1 = new FileWriter(s1, true))
        {
            for (Integer i : buffer) fileWriter1.write(i);
        }

        try(FileWriter fileWriter2 = new FileWriter(s1, true))
        {
            for (Integer i : buffer2) fileWriter2.write(i);
        }
    }
}
