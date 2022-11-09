package com.javarush.task.pro.task13.task1334;

/* 
Антипирамида
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        Rewards rewards = new Rewards();
        for (Voter v : corporatePyramid.keySet()) {
            if (v.getPersonalQuality().equalsIgnoreCase("Good")) {
                corporatePyramid.put(v, rewards.getGoodRewardsMap());
            } else if (v.getPersonalQuality().equalsIgnoreCase("Holy")) {
                corporatePyramid.put(v, rewards.getHolyRewardsMap());
            }
        }
    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}