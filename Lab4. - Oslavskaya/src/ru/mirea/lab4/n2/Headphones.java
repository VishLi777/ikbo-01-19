package ru.mirea.lab4.n2;
import ru.mirea.lab4.n2.Priceable;

class Headphones implements Priceable {
    private float price;
    private String color;

    public Headphones(float price, String color){
        this.price = price;
        this.color = color;
    }

    public void getPrice() {
        System.out.printf("Price is'%s' and color is  %s \n", price, color);
    }
}
