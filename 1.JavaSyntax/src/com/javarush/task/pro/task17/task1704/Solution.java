package com.javarush.task.pro.task17.task1704;

import java.util.ArrayList;

/* 
Космическая одиссея ч.2
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        Human humanOne = (Human) astronauts.get(0);
        pilot(humanOne);
        Human humanTwo = (Human) astronauts.get(1);
        pilot(humanTwo);

        Cat catt = (Cat) astronauts.get(3);
        research(catt);

        Dog dogg = (Dog) astronauts.get(2);
        createDirection(dogg);
    }

    public static void pilot(Human human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
