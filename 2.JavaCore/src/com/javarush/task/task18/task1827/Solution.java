package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;


        }
    }

        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

            List<Product> products = new ArrayList<>();

            while (bufferedReader.ready()) {
                Product product = getProduct(bufferedReader.readLine());
                products.add(product);
            }
            if (args.length == 0) return;
            if (args[0].equals("-c")) {
                int id = 0;
                for(Product product : products) {
                    if (product.id > id) id = product.id;
                }
                String name = args[1];
                if (name.length() > 30) {
                    name = name.substring(0,30);
                }

                String price = args[2];
                if (price.length() > 8) {
                    price = price.substring(0,8);
                }

                String quantity = args[3];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0,4);
                }
                Product product = new Product(++id, name, price, quantity);

                bufferedWriter.write('\n');
                bufferedWriter.write(product.toString());
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
    public static Product getProduct(String str) {
        String id = str.substring(0,8).trim();
        String name = str.substring(8, 38).trim();
        String price = str.substring(38, 46).trim();
        String quantity = str.substring(46, 50).trim();

        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
