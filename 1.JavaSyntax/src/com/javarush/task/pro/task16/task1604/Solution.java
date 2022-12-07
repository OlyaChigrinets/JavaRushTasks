package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1997, 8, 22);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                result = "воскресенье";
                break;
            case 2:
                result = "понедельник";
                break;
            case 3:
                result = "вторник";
                break;
            case 4:
                result = "среда";
                break;
            case 5:
                result = "четверг";
                break;
            case 6:
                result = "пятница";
                break;
            case 7:
                result = "суббота";
                break;
        }
        return result;
    }
}
