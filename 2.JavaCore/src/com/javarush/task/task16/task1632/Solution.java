package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new One());
        threads.add(new Two());
        threads.add(new Three());
        threads.add(new Four());
        threads.add(new Five());
    }

    public static void main(String[] args) {
    }

    public static class One extends Thread {

        public One() {
        }

        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Two extends Thread {

        public Two() {
        }
        @Override
        public void run() {
            try {
                Thread.sleep(0);
            }catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Three extends Thread {

        public Three() {
        }
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }
    }

    public static class Four extends Thread implements Message {

        public Four() {
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Five extends Thread {

        public Five() {
        }

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            int count = 0;
            while(scanner.hasNextInt()) {
                i = scanner.nextInt();
                count += i;
            }
            System.out.println(count);
        }
    }


}

