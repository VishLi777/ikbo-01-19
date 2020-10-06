package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo1 {


    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("Null parameter in key");
        }

    }

    public static void main(String[] args) {

        //Задание 5.
        /*Изначально функцию getDetails(String key) неудобно оборачивать в try-catch,
         т.к. непонятно, какой именно части кода необходим блок; решение -> отдельная
        функция printMessage(String key), которая будет вызывать проверку getDetails(String key),
        которую и следует поместить в блок try-catch */

        printMessage(null); //exception
        printMessage("string"); //right message

    }
}