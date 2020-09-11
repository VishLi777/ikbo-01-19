/*
2. Создать окно, отобразить в нем картинку, путь к которой указан в
аргументах командной строки.
 */
package ru.mirea.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //ввод пути к картинке
        String path = scanner.nextLine();
        new Num2(path);
    }
}