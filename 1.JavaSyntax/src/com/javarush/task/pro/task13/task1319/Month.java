package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winter = {Month.JANUARY, Month.FEBRUARY, Month.DECEMBER};
        return winter;
    }

    public static Month[] getSpringMonths() {
        Month[] spring = {Month.MARCH, Month.APRIL, Month.MAY};
        return spring;
    }

    public static Month[] getSummerMonths() {
        Month[] summer = {Month.JUNE, Month.JULY, Month.AUGUST};
        return summer;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumn = {Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER};
        return autumn;
    }
}
