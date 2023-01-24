package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int count = Integer.MIN_VALUE;

        for (int i = 1; i <= two; i++) {
            if(one % i == 0 && two % i == 0) {
               count = i;
            }
        }
        System.out.println(count);
    }
}
