/* 2. Написать регулярное выражение, определяющее является ли данная строка строкой
"abcdefghijklmnopqrstuv18340" или нет.
    a) пример правильных выражений: abcdefghijklmnopqrstuv18340
    b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340. */
package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println( ANSI_PURPLE + "Enter your line:" + ANSI_RESET );
        Pattern patt = Pattern.compile("abcdefghijklmnopqrstuv18340");

        Matcher match = patt.matcher(in.nextLine());
        if (match.matches()){
            System.out.println(ANSI_BLUE + " The entered string matches the string 'abcdefghijklmnopqrstuv18340'"+ ANSI_RESET);
        } else {
            System.out.println(ANSI_YELLOW + " The entered string doesn`t match the string 'abcdefghijklmnopqrstuv18340'" + ANSI_RESET);
        }
    }
}
