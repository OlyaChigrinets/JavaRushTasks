package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream old = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();

        String line = byteArrayOutputStream.toString();

        System.setOut(old);

       // System.out.println(line);
        StringBuilder stringBuilder = new StringBuilder();

        char[] array = line.toCharArray();
        for(char c : array) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }
        String result = stringBuilder.toString();

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
