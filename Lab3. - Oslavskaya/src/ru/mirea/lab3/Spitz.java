package ru.mirea.lab3;

public class Spitz extends Dog {

    public Spitz(String name, String type, int height, float weight){
        super(name, type, height, weight);
    }
    public void dogActions(){
        System.out.println("The dog is lying");
    }

    public String toString(){
        return super.toString();
    }

}
