package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread a = new SpecialThread();
        SpecialThread b = new SpecialThread();
        SpecialThread c = new SpecialThread();
        SpecialThread d = new SpecialThread();
        SpecialThread e = new SpecialThread();

        list.add(new Thread(a));
        list.add(new Thread(b));
        list.add(new Thread(c));
        list.add(new Thread(d));
        list.add(new Thread(e));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
