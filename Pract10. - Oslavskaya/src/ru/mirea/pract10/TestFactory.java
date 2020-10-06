package ru.mirea.pract10;

public class TestFactory {
    public static void main(String[] args) {
        Complex compl = new ConcreteFactory().createComplex(5, 10);
        Complex compl1 = new Complex();
        System.out.println(compl);
        System.out.println("------------");
        compl1.setImage(2);
        compl1.setReal(3);
        System.out.print(compl1);
    }
}
