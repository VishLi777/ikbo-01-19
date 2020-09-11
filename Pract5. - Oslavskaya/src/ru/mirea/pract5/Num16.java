/*
16. Количество элементов, равных максимуму
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом 0. Определите, какое количество элементов этой
последовательности, равны ее наибольшему элементу.
В этой задаче нельзя использовать глобальные переменные. Функция
получает данные, считывая их с клавиатуры, а не получая их в виде параметра.
В программе на языке Python функция возвращает результат в виде кортежа из
нескольких чисел, и функция вообще не получает никаких параметров. В
программе на языке C++ результат записывается в переменные, которые
передаются в функцию по ссылке. Других параметров, кроме как используемых
для возврата значения, функция не получает.
48
Гарантируется, что последовательность содержит хотя бы одно число
(кроме нуля)

 */
package ru.mirea.pract5;


public class Num16 {
    public static void recursion(int max, int counter) {
        java.util.Scanner in = new java.util.Scanner(System.in);//пользователь вводит данные
        int n = in.nextInt();

        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, ++counter);
            }
            else {
                recursion(max, counter);
            }
        } else {
            System.out.println(counter);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0); // вызов рекурсивной функции
    }
}

