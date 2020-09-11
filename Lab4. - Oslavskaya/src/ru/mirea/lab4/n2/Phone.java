package ru.mirea.lab4.n2;

class Phone implements Priceable{
    private float price;
    private String color;

    float getP(){
        return price;
    }
    String getColor(){
        return color;
    }
    Phone(float price, String color){
        this.price = price;
        this.color = color;
    }

    public void getPrice() {
        System.out.printf("Phone`s price:" + price +"\ncolor:" + color);
    }
}
