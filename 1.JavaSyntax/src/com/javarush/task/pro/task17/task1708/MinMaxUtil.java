package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int one, int two) {
        return Math.min(one, two);
    }

    public static int min(int one, int two, int three) {
        int min = Math.min(one, two);
        min = Math.min(min, three);
        return min;
    }

    public static int min(int one, int two, int three, int four) {
        int min = Math.min(one, two);
        min = Math.min(min, three);
        min = Math.min(min, four);
        return min;
    }

    public static int min(int one, int two, int three, int four, int five) {
        int min = Math.min(one, two);
        min = Math.min(min, three);
        min = Math.min(min, four);
        min = Math.min(min, five);
        return min;
    }

    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static int max(int one, int two, int three) {
        int max = Math.max(one, two);
        max = Math.max(max, three);
        return max;
    }

    public static int max(int one, int two, int three, int four) {
        int max = Math.max(one, two);
        max = Math.max(max, three);
        max = Math.max(max, four);
        return max;
    }

    public static int max(int one, int two, int three, int four, int five) {
        int max = Math.max(one, two);
        max = Math.max(max, three);
        max = Math.max(max, four);
        max = Math.max(max, five);
        return max;
    }
}
