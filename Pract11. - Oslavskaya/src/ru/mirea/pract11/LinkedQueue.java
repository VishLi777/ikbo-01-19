package ru.mirea.pract11;

import java.util.LinkedList;

public class LinkedQueue<T> extends AbstractQueue<T> {

    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    /*peek() - возвращает элемент из головы очереди. Возвращает null, если очередь пуста. Элемент не удаляется.*/
    public T peek() {
        if(queue == null) {
            return null;
        }else{
            return queue.get(0);
        }
    }

    @Override
    /*роll() - возвращает элемент из головы очереди и удаляет его. Возвращает null, если очередь пуста.*/
    public T poll() {
        if (queue == null)
            return null;
        T element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    /*boolean offer(Е оbj) - пытается добавить оbj в очередь. Возвращает true, если оbj добавлен, и false в противном случае.*/
    public boolean offer(T element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }
}
