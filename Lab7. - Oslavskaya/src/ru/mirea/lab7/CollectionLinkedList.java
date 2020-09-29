/*
Протестировать работу коллекции LinkedList.
 */
package ru.mirea.lab7;

import java.util.LinkedList;
public class CollectionLinkedList {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>();
// добавим в список ряд элементов
        cities.add("Belfast");
        cities.add("Birmingham");
        cities.addLast("Chester"); // добавляем на последнее место
        cities.addFirst("Lincoln"); // добавляем на первое место
        cities.add(1, "Liverpool"); // добавляем элемент по индексу 1
        System.out.printf("\"There are %d elements at list: \n", cities.size());
        System.out.println(cities.get(1));
        cities.set(1, "Oxford");
        for(String city : cities){
            System.out.println(city);
        }
// проверка на наличие элемента в списке
        if(cities.contains("Belfast")){
            System.out.println("-----------------------------");
            System.out.println("The List contains Belfast");
            System.out.println("-----------------------------");
        }
        cities.remove("Belfast");
        System.out.println("Belfast was removed");
        System.out.println("-----------------------------");
        cities.removeFirst(); // удаление первого элемента
        System.out.println("The first element was removed");
        System.out.println("-----------------------------");

        cities.removeLast(); // удаление последнего элемента
        System.out.println("The last element was removed");
        System.out.println("-----------------------------");
        System.out.println("Remaining elements:");
        System.out.println(cities);
        System.out.println("-----------------------------");

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Paul"));
        people.addFirst(new Person("Mike"));
        people.addLast(new Person("John"));
        people.remove(1); // удаление второго элемента
        for(Person p : people){
            System.out.println(p.getName());


        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{
    private String name;
    public Person(String value){
        name=value;
    }
    String getName(){return name;}
}