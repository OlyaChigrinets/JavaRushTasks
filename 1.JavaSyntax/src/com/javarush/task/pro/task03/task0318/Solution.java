package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if ((hour <= 0) && (min < 30))
            System.out.println(NOT_YET);
        if ((hour <= 0) && (min == 30))
            System.out.println(DONE);
        if ((hour >= 0) || (min > 30))
            System.out.println(HORRIBLY_DONE);
        //напишите тут ваш код
    }
}
