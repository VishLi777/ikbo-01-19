package ru.mirea.lab1;

public class Book{
    private int pages;
    private float thickness;

    public Book(int pages, float thickness){
        this.pages = pages;
        this.thickness = thickness;
    }

    public int getPages(){
        return pages;
    }

    public float getThickness(){
        return thickness;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setThickness(float thickness){
        this.thickness = thickness;
    }

    public String toString(){
        return "Pages are: " + pages + "\nThickness is: " + thickness + "\n--------";
    }
}
