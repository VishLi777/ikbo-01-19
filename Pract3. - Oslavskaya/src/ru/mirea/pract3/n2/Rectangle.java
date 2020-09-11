package ru.mirea.pract3.n2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }


    public double getArea(){
        return this.width * this.length;
    }


    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }


    public String toString(){
        return "Rectangle" + "\nwidth:" + width + "\nlength:" + length + "\n----\n" + super.toString();
    }
}