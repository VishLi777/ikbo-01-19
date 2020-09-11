/*
Вам нужно написать тестовый класс, чтобы самостоятельно это проверить,
необходимо объяснить полученные результаты и связать их с понятием ООП -
полиморфизм. Некоторые объявления могут вызвать ошибки компиляции.
Объясните полученные ошибки, если таковые имеются.
 */
package ru.mirea.pract3.n3;

import ru.mirea.pract3.n2.Shape;
import ru.mirea.pract3.n2.Circle;
import ru.mirea.pract3.n2.Rectangle;
import ru.mirea.pract3.n2.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());

        /*
        1. т.к. Класс Circle наследуется от Shape, то:
        При вызове метода getRadius() виртуальная машина пытается найти его в классе-родителе (в Shape).
        Но этот метод отсутствует в родителе, из-за чего вызов не возможен.
        */

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        /*
        2. т.к. Circle является дочерним классом Shape, и содаётся после родительского, то эта часть кода сработала без ошибок
        */

        // Shape s2 = new Shape();
        /*
        3. По определению абстрактного класса создавать объекты этого класса невозможно, т.к. их роль-базовый функционал для дочерних классов, которые реализуют описанный функционал
        */

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());

        /*
        4. Так же как в пункте 1 для класса Rectangle и метода getLength().
        */

        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        /*
        5. Так же как в пункте 2.
        */

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());

        /*
        6. Так же как в пункте 1 для класса Square и метода getSide().
        */

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        /*
        7. Shape -> Rectangle , также получение метода класса Square(дочерний класс Rectangle).
        Вызов метода из класса, который является наследником, невозможен, т.к. в классе-родителе нет информации о нём.
        */

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        /*
        8. Rectangle -> Square
        Отработает без ошибок, потому что Square является наследником класса Rectangle.
        */
    }
}