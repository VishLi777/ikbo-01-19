package ru.mirea.pract11;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected List<T> queue;

    @Override
    public T element() {
        T elem = peek();
        if (elem != null) {
            return elem;
        }
        throw new NoSuchElementException();
    }

    public boolean add(T elem) {
        if (offer(elem)) {
            return true;
        }
        throw new IllegalStateException("Queue full");
    }


    public boolean addAll(Collection<? extends T> collection) {
        if (collection == null) {
            throw new NullPointerException();
        }
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        boolean modified = false;
        for (T elem : collection) {
            if (add(elem))
                modified = true;
        }
        return modified;
    }

    public abstract int size();

    public T remove() {
        T elem = poll();
        if (elem != null){
            return elem;
        }
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}