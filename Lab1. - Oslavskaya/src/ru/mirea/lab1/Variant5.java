package ru.mirea.lab1;
import java.util .*;

public class Variant5 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Значение num: " + num);
        System.out.println(calculateFactorial(num));
        }

    public static long calculateFactorial(int num){
        long fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}
