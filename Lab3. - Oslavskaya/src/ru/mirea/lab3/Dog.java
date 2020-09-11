package ru.mirea.lab3;

public abstract class Dog {
    private String name;
    private String type;
    private int height;
    private float weight;

    public Dog(String name, String type, int height, float weight) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;

    }

    public abstract void dogActions();

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public String toString(){
        return "Name is: " + height + "\nType is: " + height + "\nHeight is: " + height + "\nWeight is: " + weight + "\n--------";
    }




}
