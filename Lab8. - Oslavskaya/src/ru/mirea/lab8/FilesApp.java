/*
1. Реализовать запись в файл введённой с клавиатуры информации
2. Реализовать вывод информации из файла на экран
3. Заменить информацию в файле на информацию, введённую с
клавиатуры
4. Добавить в конец исходного файла текст, введённый с клавиатуры
 */
package ru.mirea.lab8;

import java.io.*;
import java.util.Scanner;
public class FilesApp {

    private static void fillFile(boolean append){
        try (FileWriter writer = new FileWriter("file.txt", append)){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to write in the file: ");
            String line = scanner.nextLine();
            writer.write(line);
            writer.flush();
        }catch (IOException e){
            System.out.println("No such file");
        }

    }
    private static void readFile(){
        try (FileReader reader = new FileReader("file.txt")){
            int c;
            System.out.println("Lines in text file:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("No such file");
        }
    }
    public static void main(String[] args){
        /*1*/
        fillFile(false);
        System.out.println();
        /*2*/
        readFile();
        System.out.println("\n");
        /*3*/
        System.out.println("Rewrite text in the file");
        fillFile(false);
        readFile();
        System.out.println("\n");
        /*4*/
        fillFile(true);
        System.out.println();
        readFile();
    }
}
