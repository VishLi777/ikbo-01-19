package ru.mirea.pract10;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex() {
        return new Complex();
    }


}