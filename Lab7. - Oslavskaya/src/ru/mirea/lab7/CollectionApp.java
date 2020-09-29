/*
Протестировать работу коллекции ArrayList.
 */
package ru.mirea.lab7;

import java.util.ArrayList;
public class CollectionApp {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
// добавим в список ряд элементов
        states.add("New York");
        states.add("California");
        states.add("Illinois");
        states.add("Texas");

        states.add(1, "Arizona"); // добавляем элемент по индексу 1
        System.out.println("-----------------------------");
        System.out.println("Element, which was added:");
        System.out.println("-----------------------------");

        System.out.println(states.get(1));// получаем 2-й объект
        System.out.println("-----------------------------");
        states.set(1, "Pennsylvania"); // установка нового значения для 2-го объекта
        System.out.printf("There are %d elements at list: \n", states.size());
        System.out.println("-----------------------------");
        for(String state : states){
            System.out.println(state);
        }
        System.out.println("-----------------------------");
        if(states.contains("New York")){
            System.out.println("The List contains New York state");
            System.out.println("-----------------------------");
        }


// удалим несколько объектов
        states.remove("New York");
        states.remove(0);
        Object[] countries = states.toArray();
        for(Object country : countries){
            System.out.println(country);
        }
        System.out.println("-----------------------------");
        System.out.println("New York state  and Pennsylvania were removed");
        System.out.println("-----------------------------");
    }
}