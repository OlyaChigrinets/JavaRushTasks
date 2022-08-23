package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<100){
            i++;
            if (i%2==1)
                continue;
            sum=sum+i;
        }
        System.out.println(sum);

    }
}