package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s. nextInt();
        int b = s. nextInt();
        int c = s. nextInt();
        boolean ab = (a==b);
        boolean ac = (a==c);
        boolean bc = (b==c);
        boolean abc = (a==b && a==c && b==c);
        if (abc)
            System.out.print(a+" "+b+" "+c);
        else         if (ab)
            System.out.print(a+" "+b);
        else         if (ac)
            System.out.print(a+" "+c);
        else         if (bc)
            System.out.print(b+" "+c);

        //напишите тут ваш код
    }
}
