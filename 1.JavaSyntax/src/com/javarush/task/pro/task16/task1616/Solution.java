package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> sort = new TreeSet<String>();
        for (String s : ZoneId.getAvailableZoneIds()) {
            sort.add(s);
        }
        return sort;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId beijing = ZoneId.of("Asia/Shanghai");
        ZonedDateTime bei = ZonedDateTime.now(beijing);

        return bei;
    }
}
