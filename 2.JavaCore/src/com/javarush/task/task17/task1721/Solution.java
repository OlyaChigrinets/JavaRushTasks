package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        while (bufferedReader.ready()) {
            allLines.add(bufferedReader.readLine());
        }

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path2));
        while (bufferedReader2.ready()) {
            forRemoveLines.add(bufferedReader2.readLine());
        }
        bufferedReader.close();
        bufferedReader2.close();

        System.out.println(allLines);
        System.out.println(forRemoveLines);

        Solution solution = new Solution();
        solution.joinData();

        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
