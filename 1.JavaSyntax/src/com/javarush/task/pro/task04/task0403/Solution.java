package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isEnter = false;
        int i = 0;
        while(!isEnter){
            if (s.hasNextInt()) {
                i += s.nextInt();
            }
            else {
                String word = s.nextLine();
                isEnter = word.equals("ENTER");
            }
        }
        System.out.println(i);


    }
}