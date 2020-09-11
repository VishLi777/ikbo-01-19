package ru.mirea.pract1;

public class Main {
    public static void main(String[] args){
        Dog sheila = new Dog(40, 10.2f);
        System.out.println(sheila.toString());

        Dog lucky = new Dog(58, 15.3f);
        System.out.println(lucky.toString());

        Ball b = new Ball(10, "red");
        System.out.println(b.toString());

        Ball myach = new Ball(20, "orange");
        System.out.println(myach.toString());

        Book vampires = new Book(500, 7.8f);
        System.out.println(vampires.toString());

        Book nikogde = new Book(239, 4.7f);
        System.out.println(nikogde.toString());

    }

}