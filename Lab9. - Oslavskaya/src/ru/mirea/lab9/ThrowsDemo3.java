package ru.mirea.lab9;

import java.util.Scanner;


public class ThrowsDemo3 {
    public static void getKey() {
        Scanner myScann = new Scanner(System.in);
        System.out.print("Enter Key ");
        try {
            String Key = myScann.nextLine();
            printDetails(Key);
        } catch (Exception e) {
            System.out.println("The key is empty, error");
        }
    }


    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty str");
        }
        return "data for " + key;
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    //Задания 7-8
    public static void main(String[] args) {

        getKey();

    }
}
