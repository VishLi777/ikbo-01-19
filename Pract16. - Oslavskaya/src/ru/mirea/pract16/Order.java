package ru.mirea.pract16;

public interface Order {
    boolean add(Item item);
    boolean remove(String name);
    int removeAll(String name);
    int dishQuantity();
    Object[] getDishes();
    double costTotal();
    Object[] dishesNames();
    Object[] sortedDishesByCostDesc();
}
