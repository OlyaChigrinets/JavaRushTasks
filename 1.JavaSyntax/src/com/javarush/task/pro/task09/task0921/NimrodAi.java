package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;
import java.util.Locale;

public class NimrodAi {
    
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (PastryLoader pastryloader : pastryLoaders) {
            for (String [][] memoryBank : pastryloader.memory) {
                for (String[] memoryCell : memoryBank) {
                    for (int i = 0; i < memoryCell.length; i++) {
                        if (memoryCell[i].toLowerCase().contains("nimrod")) {
                            memoryCell[i] = memoryCell[i].toLowerCase().replaceAll("nimrod", "pirate ship");
                        }
                    }
                }
            }
        }

    }
}
