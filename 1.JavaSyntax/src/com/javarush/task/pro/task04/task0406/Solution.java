package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            String word = s.nextLine();
            if (word.equals("enough")) {
                break;
            }
            System.out.println(word);
        }
    }
}