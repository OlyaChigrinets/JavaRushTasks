package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");

        Person person = null;


        if (args[0].equals("-c")) {
            if (args[2].equals("ж")) {
                person = Person.createFemale(args[1], simpleDateFormat.parse(args[3]));
            } else {
                person = Person.createMale(args[1], simpleDateFormat.parse(args[3]));
            }

            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        }

        if (args[0].equals("-r")) {

            if (args[1] != null) {
                person = allPeople.get(Integer.parseInt(args[1]));

                System.out.println(person.getName() + " " +  (person.getSex() == Sex.FEMALE? "ж" : "м")
                + " " + simpleDateFormat2.format(person.getBirthDate()));
            }
        }

        if (args[0].equals("-u")) {
            person = allPeople.get(Integer.parseInt(args[1]));

            person.setName(args[2]);
            person.setSex(Objects.equals(args[3], "м") ? Sex.MALE:Sex.FEMALE);
            person.setBirthDate(simpleDateFormat.parse(args[4]));
        }

        if (args[0].equals("-d")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
}
