package ru.mirea.pract9;


public class UnacceptableInnException extends Exception {
    public UnacceptableInnException() {
        super("ИНН состоит из 12 цифр!");
    }
}