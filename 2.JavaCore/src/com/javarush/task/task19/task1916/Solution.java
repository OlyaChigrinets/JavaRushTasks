package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        List<String> fileLines1 = new ArrayList<>();
        List<String> fileLines2 = new ArrayList<>();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        while (bufferedReader1.ready()) fileLines1.add(bufferedReader1.readLine());
        bufferedReader1.close();

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        while (bufferedReader2.ready()) fileLines2.add(bufferedReader2.readLine());
        bufferedReader2.close();

        int count1 = 0;
        int count2 = 0;

        while ((count1 < fileLines1.size()) && (count2 < fileLines2.size())) {
            if (fileLines1.get(count1).equals(fileLines2.get(count2))) {
                lines.add(new LineItem(Type.SAME, fileLines1.get(count1)));
                count1++;
                count2++;
            } else if ((count1 + 1) < fileLines1.size() && fileLines1.get(count1 + 1).equals(fileLines2.get(count2))) {
                lines.add(new LineItem(Type.REMOVED, fileLines1.get(count1)));
                count1++;
            } else if ((count2 + 1) < fileLines2.size() && fileLines2.get(count2 + 1).equals(fileLines1.get(count1))) {
                lines.add(new LineItem(Type.ADDED, fileLines2.get(count2)));
                count2++;
            }
        }
        while (count1 < fileLines1.size()) {
            lines.add(new LineItem(Type.REMOVED, fileLines1.get(count1)));
            count1++;
        }
        while (count2 < fileLines2.size()) {
            lines.add(new LineItem(Type.ADDED, fileLines2.get(count2)));
            count2++;
        }

    }
    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
