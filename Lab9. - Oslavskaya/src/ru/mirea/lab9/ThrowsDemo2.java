package ru.mirea.lab9;

import java.util.Scanner;


public class ThrowsDemo2 {

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }


    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("String is empty");
        }
    }

    //Задание 6
    public static void main(String[] args) {

        printDetails("newKey");
        printDetails("");

    }

}
