/*
2. Реализовать интерфейс Priceable, имеющий метод getPrice(),
возвращающий некоторую цену для объекта. Проверить работу для
различных классов, сущности которых могут иметь цену.
 */

package ru.mirea.lab4.n2;

import ru.mirea.lab4.n2.Phone;
import ru.mirea.lab4.n2.Headphones;

public class TestP{
    public static void main(String[] args){
        Phone p = new Phone(100000.0f, "black");
        p.getPrice();
        System.out.println("\n----\n");
        Headphones h = new Headphones(10800.9f, "purple");
        h.getPrice();
    }
}