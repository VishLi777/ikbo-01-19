package ru.mirea.lab3;

public class Shepherd extends Dog {
    public Shepherd(String name, String type, int height, float weight){
        super(name, type, height, weight);
    }
    public void dogActions(){
        System.out.println("The dog is walking at the yard");
    }

    public String toString(){
        return super.toString();
    }
}
