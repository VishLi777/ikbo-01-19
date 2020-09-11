package ru.mirea.pract2;

public class TestAuthor {
    public static void main(String[] args){
        Author neil = new Author("Neil Gaiman", "gaiman@gmail.com", 'm');
        System.out.println(neil.toString());

        Author mikhail  = new Author("Mikhail Bulgakov", "bulmi@gmail.com", 'm');
        System.out.println(mikhail.toString());
    }
}
