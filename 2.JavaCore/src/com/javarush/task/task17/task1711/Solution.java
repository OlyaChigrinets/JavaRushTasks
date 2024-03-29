package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");

    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            String name = args[i];
                            String sex = args[i+1];
                            Date date = simpleDateFormat.parse(args[i+2]);
                            Person person = sex.equals("м") ? Person.createMale(name, date): Person.createFemale(name, date);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;

                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i <args.length; i += 4) {
                            int id = Integer.parseInt(args[i]);
                            Person person =allPeople.get(id);
                            String sex = args[i+2];
                            person.setName(args[i+1]);
                            person.setSex("м".equals(sex) ? Sex.MALE : Sex.FEMALE);
                            person.setBirthDate(simpleDateFormat.parse(args[i+3]));
                        }
                    }
                    break;

                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    break;

                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            String name = person.getName();
                            String sex = person.getSex().equals(Sex.FEMALE) ? "ж" : "м";
                            String date = simpleDateFormat2.format(person.getBirthDate());
                            System.out.println(name + " " + sex + " " + date);
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
