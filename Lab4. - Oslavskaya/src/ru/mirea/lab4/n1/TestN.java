/*
1. Создать интерфейс Nameable, с методом getName(), возвращающим
имя объекта, реализующего интерфейс. Проверить работу для
различных объектов (например, можно создать классы, описывающие
разные сущности, которые могут иметь имя: планеты, машины,
животные и т. д.).
 */
package ru.mirea.lab4.n1;

import ru.mirea.lab4.n1.Animals;
import ru.mirea.lab4.n1.Planet;

public class TestN{
    public static void main(String[] args){
        Planet planet = new Planet("Pluton", "light brown");
        planet.getName();
        System.out.println("\n----\n");
        Animals dogs = new Animals("Dalmatian", "spotted");
        dogs.getName();
    }
}
