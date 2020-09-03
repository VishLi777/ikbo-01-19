package ru.mirea.lab1;

public class Ball {
    private int diameter;
    private String color;

    public Ball(int diameter, String color){
        this.diameter = diameter;
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String toString() {
        return "Diameter is: " + diameter + "\nColor is: " + color + "\n--------";
    }
}