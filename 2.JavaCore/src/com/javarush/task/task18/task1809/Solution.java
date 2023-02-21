package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        List<Integer> integerList = new ArrayList<>();

       while (fileInputStream.available() > 0) {
           integerList.add(fileInputStream.read());
       }

       Collections.reverse(integerList);

       for (Integer i : integerList) {
           fileOutputStream.write(i);
       }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
