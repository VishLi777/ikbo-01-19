package ru.mirea.pract1;

public class Dog {
    private int height;
    private float weight;

    public Dog(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }

    public float getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public String toString(){
        return "Height is: " + height + "\nWeight is: " + weight + "\n--------";
    }
}
