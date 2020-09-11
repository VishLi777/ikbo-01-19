package ru.mirea.lab2;

public class Book {
    private String author;
    private String title;
    private int yearOfWriting;
    private float thickness;

    public Book(String author, String title, int yearOfWriting, float thickness){
        this.author = author;
        this.title = title;
        this.yearOfWriting = yearOfWriting;
        this.thickness = thickness;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int yearOfWriting(){
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting){
        this.yearOfWriting = yearOfWriting;
    }

    public float getThickness(){
        return thickness;
    }

    public void setThickness(float thickness){
        this.thickness = thickness;
    }

    public String toString(){
        return "The author is: " + author + "\nThe title is: " + title + "\nThe year of writing is: " + yearOfWriting + "\nThickness is: " + thickness + "\n--------";
    }
}

