package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameFile1 = scanner.nextLine();
        String nameFile2 = scanner.nextLine();
        String nameFile3 = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(nameFile1);
        FileOutputStream outputStream2 = new FileOutputStream(nameFile2);
        FileOutputStream outputStream3 = new FileOutputStream(nameFile3);

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int size2;
            int size3;

            if (buffer.length % 2 == 1) {
                size2 = (buffer.length + 1) / 2;
                size3 = (buffer.length - 1) /2;
            } else {
                size2 = buffer.length / 2;
                size3 = buffer.length / 2;
            }
            int cont = inputStream.read(buffer);
            outputStream2.write(buffer, 0, size2);
            outputStream3.write(buffer, size2, size3);
        }
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
