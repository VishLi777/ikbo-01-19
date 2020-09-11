package ru.mirea.pract3.n2;

public class Square extends Rectangle{
    public Square() {}

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }


    public void setWidth(double width){
        super.setWidth(width);
    }


    public void setLength(double length){
        super.setLength(length);
    }

    public String toString() {
        return "Square" + "\nside: " + getSide() + "\n----\n" + super.toString();
    }
}