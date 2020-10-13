package ru.mirea.pract11;

public interface Queue<T> { /*Use Queue<T> if you need to access the information in the same order that it is stored in the collection.*/

    T peek();
    T poll();
    T remove(); //(входит в poll)
    boolean offer(T element);
    T element();


}
