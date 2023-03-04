package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            try (FileReader fileReader = new FileReader(s)){
            } catch (FileNotFoundException e) {
                System.out.println(s);
                break;
            }
        }
    }
}
