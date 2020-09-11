package ru.mirea.lab4.n1;

public class Animals implements Nameable {
    private String name;
    private String color;

    String getN(){
        return name;
    }
    String getColor(){
        return color;
    }
    Animals(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void getName(){
        System.out.printf("Animal`s name:" + name +"\ncolor:" + color);
    }
}
