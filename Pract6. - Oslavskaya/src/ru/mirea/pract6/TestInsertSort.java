/*
Написать тестовый класс, который создает массив класса Student и
сортирует массив iDNumber и сортирует его вставками.
 */
package ru.mirea.pract6;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        Students[] array = new Students[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Students(i + " student",(int) Math.round(Math.random() * 1000));
        }
        System.out.println("Initial array of students:");
        Arrays.stream(array).forEach(System.out::println);

        System.out.println("\nSorted array:");
        insertionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void insertionSort(Students[] arr) {
        for (int left = 1; left < arr.length; left++) {
            Students detIdStudent = arr[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            while (i >= 0 && arr[i].getId() > detIdStudent.getId()) {
                arr[i + 1] = arr[i];
                i--;
            }
            // В освободившееся место вставляем вытащенное значение
            arr[i + 1] = detIdStudent;
        }
    }
}

    /*for (int left = 0; left < array.length; left++) {
        // Вытаскиваем значение элемента
        int value = array[left];
        // Перемещаемся по элементам, которые перед вытащенным элементом
        int i = left - 1;
        for (; i >= 0; i--) {
        // Если вытащили значение меньшее — передвигаем больший элемент дальше
        if (value < array[i]) {
        array[i + 1] = array[i];
        } else {
        // Если вытащенный элемент больше — останавливаемся
        break;
        }
        }
        // В освободившееся место вставляем вытащенное значение
        array[i + 1] = value;
        }

     */
