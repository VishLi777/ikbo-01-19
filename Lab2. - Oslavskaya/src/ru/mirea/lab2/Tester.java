package ru.mirea.lab2;

public class Tester {
    public static void main(String[] args) {
        Book book = new Book("Neil Gaiman", "Nowhere", 1996, 15.5f);
        System.out.println(book.toString());
        book.setYearOfWriting(1997);
        System.out.println(book.toString());
    }
}
