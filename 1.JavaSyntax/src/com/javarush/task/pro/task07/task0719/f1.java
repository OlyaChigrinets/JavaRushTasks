package com.javarush.task.pro.task07.task0719;

public class f1 {
    class Solution
    {
        public static void printPoints(int[] x, int[] y, int[] color)
        {
            for (int i = 0; i < x.length; i++)
                System.out.println("Цвет точки x=" + x[i] + ", y=" + y[i] + " " + color[i]);
        }

        public static void main(String[] args)
        {
            int[] x = new int[20];
            int[] y = new int[20];
            int[] color = new int[20];
            printPoints(x, y, color);
        }
    }
}
