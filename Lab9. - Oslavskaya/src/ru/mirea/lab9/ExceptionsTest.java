package ru.mirea.lab9;


import java.util.Scanner;

public class ExceptionsTest {

    public static void main(String[] args) {

        //Задание 1
        /*System.out.println(2 / 0); - "Infinity"*/

        exception1Demo(); /* перехват ошибки и вывод "Intercept division by 0"*/

        // Задание 2
        /*Без блока try catch:
        при 1 - 2 нет ошибок,
        при 1.2 - NumberFormatException,
        при 0 - ArithmeticException (dividing by zero),
        при Qwerty - NumberFormatException*/

        exception2Demo(); // перехватывает ошибки и выводит соответствующие предупреждения

        // Задание 3
        /*При добавлении catch (Exception e) проверки на другие
         исключения выполняться не будут (класс Exception - родитель всех остальных видов исключений)*/

        // Задание 4
        /*блок finally - программа будет выполнять код, находящийся в этом блоке,
        в любом случае, было ли исключение или нет*/


    }

    public static void exception1Demo() {
        try {
            System.out.println(2 / 0);
        }catch (ArithmeticException e){
            System.out.println("Intercept division by 0");
        }
    }

    public static void exception2Demo() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an int");
        try {
            int i = Integer.parseInt(myScanner.next());
            System.out.println(2 / i);
        }catch (ArithmeticException e){
            System.out.println("Intercept division by 0");
        }catch (NumberFormatException e){
            System.out.println("Wrong input format");
        }finally{
            System.out.println("Finally");
        }
    }


}