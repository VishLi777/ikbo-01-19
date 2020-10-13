package ru.mirea.pract11;

import java.util.ArrayList;

public class ArrayQueue<T> extends AbstractQueue<T> {

    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public T peek() {
        if(queue == null) {
            return null;
        }else{
            return queue.get(0);
        }
    }

    @Override
    public T poll() {
        if (queue == null)
            return null;
        T elem = queue.get(0);
        queue.remove(0);
        return elem;
    }

    @Override
    public boolean offer(T elem) {
        return queue.add(elem);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
