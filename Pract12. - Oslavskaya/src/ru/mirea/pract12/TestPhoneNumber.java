package ru.mirea.pract12;

public class TestPhoneNumber{

    public static void main(String[] args) {
        System.out.println("Numbers in a special form:");
        System.out.println("------------------");
        System.out.println(new PhoneNumber("+79175655655"));
        System.out.println(new PhoneNumber("+10428952211"));
        System.out.println(new PhoneNumber("89175655655"));
        System.out.println(new PhoneNumber("88005553535"));
        System.out.println("------------------");
    }
}
