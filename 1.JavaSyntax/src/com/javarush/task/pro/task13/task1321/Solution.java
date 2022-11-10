package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        if (ru.equalsIgnoreCase("понедельник"))
            return "Monday";

        if (ru.equalsIgnoreCase("вторник"))
            return "Tuesday";
        if (ru.equalsIgnoreCase("среда"))
            return "Wednesday";
        if (ru.equalsIgnoreCase("четверг"))
            return "Thursday";
        if (ru.equalsIgnoreCase("пятница"))
            return "Friday";
        if (ru.equalsIgnoreCase("суббота"))
            return "Saturday";
        if (ru.equalsIgnoreCase("воскресенье"))
            return "Sunday";
        else
            return "Недействительный день недели";
    }
}
