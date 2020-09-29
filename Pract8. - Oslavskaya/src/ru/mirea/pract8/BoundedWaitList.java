package ru.mirea.pract8;


/**
 * @param <E> - generic type for list
 */
public class BoundedWaitList<E> extends WaitListI<E> {
    private int capacity;

    /**
     * @param capacity - the capacity of list
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * @return the capacity of list
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element to add
     */
    @Override
    public void add(E element) {
        super.add(element);
    }

    /**
     * @return object
     */
    @Override
    public String toString() {
        return "BoundedWaitList:" + "capacity:" + capacity + "\ncontent=" + cont;
    }
}
