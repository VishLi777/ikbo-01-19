package ru.mirea.lab4.n1;
import ru.mirea.lab4.n1.Nameable;

class Planet implements Nameable {
    private String name;
    private String color;

    public Planet(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void getName() {
        System.out.printf("Planet '%s' is  %s \n", name, color);
    }
}

