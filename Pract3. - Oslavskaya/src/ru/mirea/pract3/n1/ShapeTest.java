/*
Создайте абстрактный родительский суперкласс Shape и его дочерние
классы (подклассы).
 */
package ru.mirea.pract3.n1;

public class ShapeTest{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getType();
        Rectangle r = new Rectangle();
        r.getType();
        Square s = new Square();
        s.getType();
    }
}