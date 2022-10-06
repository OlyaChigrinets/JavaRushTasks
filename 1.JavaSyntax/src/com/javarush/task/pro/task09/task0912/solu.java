package com.javarush.task.pro.task09.task0912;

import java.util.Scanner;

public class solu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String url = s.nextLine();

        int index = url.indexOf("//");
        int index2 = url.indexOf("/", index + 2);

        System.out.println(index);
        System.out.println(index2);

        String first = url.substring(0, index + 2);
        String second = url.substring(index2);
        System.out.println(first);
        System.out.println(second);

        System.out.println(first + "Javarush.ru" + second);
    }
}
