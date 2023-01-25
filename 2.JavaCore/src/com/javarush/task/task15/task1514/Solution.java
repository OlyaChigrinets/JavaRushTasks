package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.0, "Olya");
        labels.put(2.9, "Danya");
        labels.put(3.4, "fg");
        labels.put(5.6, "sda");
        labels.put(34.3, "wer");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
