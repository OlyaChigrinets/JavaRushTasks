package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    private static boolean stoper = true;

    public static boolean isStoper() {
        return stoper;
    }
    public void setStoper(boolean stoper) {
        this.stoper = stoper;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        Solution solution = new Solution();
        solution.setStoper(false);
    }

    public static class TestThread implements Runnable {
        Solution solution = new Solution();
        public void run() {
            while (solution.isStoper()) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
