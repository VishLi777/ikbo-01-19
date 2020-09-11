package ru.mirea.lab3;

public class DogTester {
    public static void main(String[] args){
        Dog tat = new Spitz("Tat","Pomeranian",20,2.5f);
        System.out.println(tat.toString());
        tat.dogActions();

        Dog agata = new Shepherd("Agata","German Shepherd", 55, 23.2f );
        System.out.println(agata.toString());
        agata.dogActions();
    }
}
