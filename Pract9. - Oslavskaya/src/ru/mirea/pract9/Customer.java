package ru.mirea.pract9;


public class Customer {
    final private String inn;
    final private String name;
    final private String secondN;
    final private String surname;


    public Customer(String name, String secondN, String surname, String inn)
            throws UnacceptableInnException {
        if (inn.length() != 12)
            throw new UnacceptableInnException();
        this.inn = inn;
        this.name = name;
        this.secondN = secondN;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer" + "\nname:'" + name + '\'' + "\nsecondN:'" + secondN +
                '\'' + "\nsurname:'" + surname + '\'' + "\nINN:'" + inn + '\'';
    }
}