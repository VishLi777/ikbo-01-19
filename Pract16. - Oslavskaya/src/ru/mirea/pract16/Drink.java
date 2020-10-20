package ru.mirea.pract16;

public final class Drink implements Item{
    private double cost;
    private String name;
    private String description;


    public Drink(String name, String description) {
        this(0.0, description, name);
    }

    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;

    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink:" + "\ncost: " + cost + "\nname: " + name + "\ndescription: " + description;
    }
}