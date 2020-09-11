/*
Перепишите суперкласс Shape и его подклассы, так как это представлено
на диаграмме Circle, Rectangle and Square.
 */
package ru.mirea.pract3.n2;

public class ShapeTest{
    public static void main(String[] args){
        Square s = new Square(4, "purple", true);
        System.out.println("   Square   ");
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println(s);
        s.setSide(15);
        System.out.println("Set another side length: " + s.getSide());
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println(s);
        s.setLength(7);
        System.out.println("Square -> Rectangle: " + s.getWidth() + " " + s.getLength());
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());

        Rectangle r = new Rectangle(13.5, 11.8, "yellow", false);
        System.out.println("\n   Rectangle   ");
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println(r);
        r.setColor("black");
        r.setWidth(14.5);
        System.out.println("Set another width and color: " + r.getWidth() + " and " + r.getColor());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println(r);

        Circle c = new Circle(10);
        System.out.println("\n   Circle   ");
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println(c);
        c.setColor("grey");
        c.setFilled(true);
        c.setRadius(6);
        System.out.println("Set another parameters");
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println(c);
    }
}
