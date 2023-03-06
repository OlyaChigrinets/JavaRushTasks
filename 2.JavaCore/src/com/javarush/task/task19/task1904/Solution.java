package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws ParseException, IOException {
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(System.in));
        Person person = personScannerAdapter.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = fileScanner.nextLine();
            String [] array = s.split(" ");
            String dateStr = array[3] + " " + array[4] + " " + array[5];
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date date = format.parse(dateStr);

            Person person = new Person(array[1], array[2], array[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
