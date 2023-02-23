package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(s);
            if (fileInputStream.available() < 1000) {
                bufferedReader.close();
                fileInputStream.close();
                throw new DownloadException();
            }

        }


    }

    public static class DownloadException extends Exception {

    }
}
