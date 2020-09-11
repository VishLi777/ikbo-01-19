/*
1. Треугольная последовательность
Дана монотонная последовательность, в которой каждое натуральное
число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,…
По данному натуральному n выведите первые n членов этой
последовательности. Попробуйте обойтись только одним циклом for.
 */
package ru.mirea.pract5;

public class Num1 {
    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        recursion(5); // вызов рекурсивной функции
    }
}
